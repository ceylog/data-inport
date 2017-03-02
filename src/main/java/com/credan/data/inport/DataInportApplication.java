package com.credan.data.inport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.credan.data.inport.dao")
@SpringBootApplication
public class DataInportApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataInportApplication.class, args);
	}
}
