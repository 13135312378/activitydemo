package com.example.tytwodemo;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan("com.example.tytwodemo.dao")
public class TytwodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TytwodemoApplication.class, args);
	}
}
