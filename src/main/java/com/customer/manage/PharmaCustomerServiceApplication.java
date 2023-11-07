package com.customer.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PharmaCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmaCustomerServiceApplication.class, args);
	}

}
