package com.ust.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
	@Autowired
	HelloWorldImpl hello;
	
	void CallHello() {
		hello.message();
	}
}
