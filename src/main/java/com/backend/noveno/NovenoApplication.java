package com.backend.noveno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NovenoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovenoApplication.class, args);
	}

}
