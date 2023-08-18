package com.yagiz.carservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import main.java.com.yagiz.commonservice.configuration.mappers.ModelMapperConfig;

@SpringBootApplication
@Import(ModelMapperConfig.class)
@ComponentScan(basePackages = {"com.yagiz.carservice","com.yagiz.companyservice"})
public class CarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

}
