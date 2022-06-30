package com.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.app.model.Person;
import com.springboot.app.repository.IPersonRepo;
import com.springboot.app.service.IPErsonService;

@Controller
public class AppController {
	
	@Autowired
	private IPErsonService service;

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
	
	
	@PostMapping("/add-person")
	public String addPerson(@ModelAttribute("person") Person person) {
		service.addPerson(person);
		return "show.jsp";
	}
	
	@GetMapping("/")
	public String getHomePage() {
		return "index.jsp";
	}
	
	@GetMapping("/search-person")
	public String getPersonDetails(@RequestParam("pname") String personName, Model m) {
		Person person = service.searchPerson(personName);
		m.addAttribute("person", person);
		return "show.jsp";
	}
	
}
