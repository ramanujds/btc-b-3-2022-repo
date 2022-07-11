package com.springboot.foodieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.foodieapp.model.FoodItem;
import com.springboot.foodieapp.service.FoodieAppApiService;

@Controller
public class FoodieAppController {
	
	@Autowired
	FoodieAppApiService foodieApi;
	
	@GetMapping("/search-item")
	public String serachFoodItem(@RequestParam("item-name") String itemName, Model m) {
		
		FoodItem item = foodieApi.getFoodItemByName(itemName);
		m.addAttribute("item", item);
		return "show-item.jsp";
	}

}
