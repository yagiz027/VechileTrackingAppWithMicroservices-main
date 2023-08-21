package com.main.java.com.yagiz.companyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.yagiz.commonservice.configuration.mappers.ModelMapperConfig;

@SpringBootApplication
@Import(ModelMapperConfig.class)
public class CompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}

}
