package com.jpa.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {

	@GetMapping("/openProfile")
	public String openProfilePage(Model model) {
			
		String name="Subrat Mandal";
		model.addAttribute("modelName",name);
		return "profile";}
	@GetMapping("/openConditional")
	public String openConditionalPage(Model model) {
		int no1=10;
		int no2=20;
		model.addAttribute("number1", no1);
		model.addAttribute("number2", no2);
		return "conditional";
	}
	@GetMapping("/openLooping")
	public String openLoopingPage(Model model) {
		
		List<Integer> numbers= List.of(1,2,3,4,5,6);
		model.addAttribute("modelNumbers",numbers);
		return"looping";
	}
}
