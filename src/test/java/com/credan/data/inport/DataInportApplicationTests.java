package com.credan.data.inport;

import com.credan.data.inport.dao.AuthMapper;
import com.credan.data.inport.entity.Role;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataInportApplicationTests {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private AuthMapper authMapper;

	@Test
	public void contextLoads() {
		List<Role> roles = authMapper.getRolesByAccountId("0000000000");

		try {
			ObjectMapper mapper = new ObjectMapper();

			String json = mapper.writeValueAsString(roles);
			log.info(json);
			JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class,Role.class);
			List<Role> rolesa = mapper.readValue(json,javaType);
			log.info(mapper.writeValueAsString(rolesa));

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
