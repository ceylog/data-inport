package com.credan.data.inport.service;

import com.credan.data.inport.dao.UserMapper;
import com.credan.data.inport.entity.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Sam Wang
 * @Date 2017/2/22.
 * @Version 0.0.1
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List getUsers(){
        User user = new User();
        RowBounds rb = new RowBounds(0,9);
        List<User> users = userMapper.selectByRowBounds(user, rb);
        return users;
    }
}
