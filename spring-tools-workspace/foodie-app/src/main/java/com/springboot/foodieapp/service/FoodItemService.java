package com.springboot.foodieapp.service;

import java.util.List;

import com.springboot.foodieapp.model.FoodItem;

public interface FoodItemService {

	public FoodItem saveFoodItem(FoodItem item);

	public FoodItem findFoodItem(long itemCode);

	public FoodItem updateFoodItem(FoodItem item);

	public boolean deleteFoodItem(long itemCode);

	public List<FoodItem> getAllItems();

}
