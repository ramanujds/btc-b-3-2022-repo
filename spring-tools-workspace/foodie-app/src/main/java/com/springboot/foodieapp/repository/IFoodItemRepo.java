package com.springboot.foodieapp.repository;

import java.util.List;

import com.springboot.foodieapp.model.FoodItem;

public interface IFoodItemRepo {

	public FoodItem saveFoodItem(FoodItem item);
	
	public FoodItem findFoodItem(long itemCode);
	
	public FoodItem updateFoodItem(FoodItem item);
	
	public boolean deleteFoodItem(long itemCode);
	
	public List<FoodItem> getAllItems();
	
}
