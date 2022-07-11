package com.springboot.foodieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.foodieapp.model.FoodItem;

@Service
public class FoodieAppApiService {
	
	private String foodApiUrl = "http://localhost:8080/items";
	
	@Autowired
	private RestTemplate rt;
	
	

	public FoodItem getFoodItemByName(String itemName) {
		FoodItem item = rt.getForObject(foodApiUrl+"/item-name/"+itemName, FoodItem.class);
		return item;
	}
	
	public FoodItem addItem(FoodItem item) {
		FoodItem savedItem = rt.postForObject(foodApiUrl, item, FoodItem.class);
		return savedItem;
	}
	
	public void deleteItem(long itemCode) {
		rt.delete(foodApiUrl+"/"+itemCode);
	}
	
	public FoodItem updateFoodItem(FoodItem item) {
		HttpEntity<FoodItem> entity = new HttpEntity<FoodItem>(item);
		FoodItem savedItem = rt.exchange(foodApiUrl, HttpMethod.PUT, entity, FoodItem.class).getBody();
		return savedItem;
	}
	
	
}
