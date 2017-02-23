package com.credan.data.inport;

import com.credan.data.inport.dao.AccountMapper;
import com.credan.data.inport.entity.Account;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataInportApplicationTests {

	@Autowired
	private AccountMapper accountMapper;

	@Test
	public void contextLoads() {
		String username = "admin";
		Account cond = new Account();
		cond.setUsername(username);
		Account account = accountMapper.selectOne(cond);

		System.out.println(account.getAccountid());

	}

}
