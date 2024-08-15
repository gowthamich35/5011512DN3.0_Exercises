package com.example.EmpManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.model")

public class EmpManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManagementSystemApplication.class, args);
	}

}