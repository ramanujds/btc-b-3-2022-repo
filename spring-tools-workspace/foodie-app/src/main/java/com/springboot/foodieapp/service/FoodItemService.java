package com.springboot.foodieapp.service;

import java.util.List;

import com.springboot.foodieapp.model.FoodItem;
import com.springboot.foodieapp.model.ItemCategory;

public interface FoodItemService {

	public FoodItem saveFoodItem(FoodItem item);

	public FoodItem findFoodItem(long itemCode);

	public FoodItem updateFoodItem(FoodItem item);

	public boolean deleteFoodItem(long itemCode);

	public List<FoodItem> getAllItems();
	
	public FoodItem getItemByItemName(String itemName);
	
	public List<FoodItem> findItemsByCategory(ItemCategory category);
	
	public List<FoodItem> findItemWithinPrice(float price);

}
