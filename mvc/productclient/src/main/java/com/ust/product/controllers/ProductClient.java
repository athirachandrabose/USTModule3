package com.ust.product.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ProductClient {

	@Autowired 
	RestTemplate template;//many sequence of  methods abstracted by one object
	@GetMapping
	public String testmethod () {
//		String url="http://localhost:8080/product/api.2.0";
//		String results=template.getForObject(url, String.class);
		String url="http://localhost:8080/api/v1/retrive/2";
		String results=template.getForObject(url, String.class);
		return "working............." + results;
	}
}
