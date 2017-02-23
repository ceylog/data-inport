package com.credan.data.inport.security;

import com.credan.data.inport.dao.AccountMapper;

import com.credan.data.inport.dao.AuthMapper;
import com.credan.data.inport.entity.Account;
import com.credan.data.inport.entity.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by samchu on 2017/2/15.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AuthMapper authMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.debug(">> CustomUserDetailsService.loadUserByUsername username={}", username);
        Account cond = new Account();
        cond.setUsername(username);
        Account account = null;
        try {
            account = accountMapper.selectOne(cond);
        }catch (Exception e){
            e.printStackTrace();
        }

        if (account == null) {
            // Not found...
            throw new UsernameNotFoundException(
                    "User " + username + " not found.");
        }

        List<Role> roles = authMapper.getRolesByAccountId(account.getAccountid());

        if (roles == null || roles.isEmpty()) {
            // No Roles assigned to user...
            throw new UsernameNotFoundException("User not authorized.");
        }

        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        for (Role role : roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getCode()));
        }

        User userDetails = new User(account.getUsername(),
                account.getPassword(),
                account.getEnabled().equals("1"), //是否可用
                !"1".equals(account.getExpired()), //是否過期
                !"1".equals(account.getCredentialsexpired()), //證書不過期為true
                !"1".equals(account.getLocked()), //帳號未鎖定為true
                grantedAuthorities);

        log.debug("<< CustomUserDetailsService.loadUserByUsername User={}", userDetails);
        return userDetails;
    }
}