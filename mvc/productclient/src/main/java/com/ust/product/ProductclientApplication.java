package com.ust.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductclientApplication.class, args);
	}
@Bean
public RestTemplate createTemplate() {
	return new RestTemplate();
}
}
