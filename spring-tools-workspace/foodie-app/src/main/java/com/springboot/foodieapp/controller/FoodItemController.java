package com.springboot.foodieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.foodieapp.model.FoodItem;
import com.springboot.foodieapp.model.ItemCategory;
import com.springboot.foodieapp.service.FoodItemService;

@RestController
public class FoodItemController {
	
	@Autowired
	private FoodItemService service;

	@GetMapping("/items/{item-code}")
	public FoodItem getFoodItem(@PathVariable("item-code") long itemCode) {
		return service.findFoodItem(itemCode);
	}
	
	@PostMapping("/items")
	public FoodItem addFoodItem(@RequestBody FoodItem item) {
		return service.saveFoodItem(item);
	}
	
	@PutMapping("/items")
	public FoodItem updateFoodItem(@RequestBody FoodItem item) {
		return service.updateFoodItem(item);
	}
	
	@DeleteMapping("/items/{item-code}")
	public boolean deleteFoodItem(@PathVariable("item-code") long itemCode) {
		return service.deleteFoodItem(itemCode);
	}
	
	@GetMapping("/items")
	public List<FoodItem> getAllFoodItems(){
		return service.getAllItems();
	}
	
	@GetMapping("/items/item-name/{item-name}")
	public FoodItem findFoodItemByName(@PathVariable("item-name") String itemName) {
		return service.getItemByItemName(itemName);
	}
	
	@GetMapping("/items/category/{category}")
	public List<FoodItem> findFoodItemsByCategory(@PathVariable ItemCategory category){
		return service.findItemsByCategory(category);
	}
	
	@GetMapping("/items/price/{price}")
	public List<FoodItem> findItemInPriceRange(@PathVariable float price){
		return service.findItemWithinPrice(price);
	}
}
