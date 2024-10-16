package com.jpa.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {
	@GetMapping("/regPage")
	public String openRegPage() {
		return "register";
	}
}
