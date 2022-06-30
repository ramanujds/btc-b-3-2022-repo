package com.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

//	@PostMapping("/hello")
//	public String sayHello(@RequestParam("personname") String personName, 
//							@RequestParam("city") String city,
//							@RequestParam("age") int age,
//							Model m) {
//		m.addAttribute("person_name", personName);
//		m.addAttribute("age", age);
//		m.addAttribute("city", city);
//		return "hello.jsp";
//	}
	
	
	@PostMapping("/hello")
	public String sayHello(@ModelAttribute("person") Person person) {
		
		return "hello.jsp";
	}
	
	@GetMapping("/")
	public String getHomePage() {
		return "index.jsp";
	}
	
}
