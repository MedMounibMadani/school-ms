package com.schoolapp.schoolsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SchoolsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolsMsApplication.class, args);
	}

}
