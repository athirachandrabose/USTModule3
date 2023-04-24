package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profession")
public class TestController2 {
@GetMapping
public String respond(Model model) {
	model.addAttribute("myTech", "java full stack developer");
	model.addAttribute("myLocation", "trivandrum");
	return "response2";//view
}
}
