package com.yagiz.groupingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import main.java.com.yagiz.commonservice.configuration.mappers.ModelMapperConfig;

@SpringBootApplication
@Import(ModelMapperConfig.class)
public class GroupingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupingServiceApplication.class, args);
	}

}
