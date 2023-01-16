package com.spring.product1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class Product1Application {

	public static void main(String[] args) {
		SpringApplication.run(Product1Application.class, args);
	}

}
