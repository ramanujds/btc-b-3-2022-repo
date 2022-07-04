package com.springboot.foodieapp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.foodieapp.model.FoodItem;
import com.springboot.foodieapp.model.ItemCategory;

public interface IFoodItemRepo extends JpaRepository<FoodItem, Long>{

	public FoodItem findByItemName(String itemName);
	
	
	public List<FoodItem> findByCategory(ItemCategory category);
	
	@Query(value = "from FoodItem where price <= :price")
	public List<FoodItem> findItemInPriceRange(float price);
	
}
