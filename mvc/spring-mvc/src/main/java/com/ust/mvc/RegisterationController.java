package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterationController {
	@PostMapping
	//https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controllers
	public String signup(@RequestParam("userName") String userName, @RequestParam("mailid") String mailid,
			Model Model) {
		if (userName.length() > 6 && mailid.length() > 6) {
			Model.addAttribute("userName", userName);
			Model.addAttribute("mailid", mailid);
			return "success";
		} else {
			return "error";
		}

	}
}
