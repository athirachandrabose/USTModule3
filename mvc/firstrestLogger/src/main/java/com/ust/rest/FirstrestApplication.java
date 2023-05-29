package com.ust.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstrestApplication {
static Logger logger=LoggerFactory.getLogger(FirstrestApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FirstrestApplication.class, args);
		
	
		logger.trace("hloo trace me");
		logger.debug("debugging the application");
		logger.info("Application started sucessfully");
		logger.warn("vulnerabilities found");
		logger.error("restart the application");
	}

}
