package com.springboot.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.foodieapp.exception.ItemNotFoundException;
import com.springboot.foodieapp.model.FoodItem;
import com.springboot.foodieapp.model.ItemCategory;
import com.springboot.foodieapp.repository.IFoodItemRepo;

@Service
public class FoodItemServiceImpl implements FoodItemService{

	@Autowired
	private IFoodItemRepo repo;
	
	@Override
	@Transactional
	public FoodItem saveFoodItem(FoodItem item) {
		return repo.save(item);
	}

	@Override
	public FoodItem findFoodItem(long itemCode) {
		if(!repo.existsById(itemCode)) {
			throw new ItemNotFoundException("Item with code - "+itemCode+" Not Found!!");
		}
		return repo.findById(itemCode).get();
	}

	@Override
	@Transactional
	public FoodItem updateFoodItem(FoodItem item) {
		return repo.save(item);
	}

	@Override
	@Transactional
	public boolean deleteFoodItem(long itemCode) {
		 repo.deleteById(itemCode);
		 return !repo.existsById(itemCode);
	}

	@Override
	public List<FoodItem> getAllItems() {
		return repo.findAll();
	}

	@Override
	public FoodItem getItemByItemName(String itemName) {
		return repo.findByItemName(itemName);
	}
	
	@Override
	public List<FoodItem> findItemsByCategory(ItemCategory category) {
		return repo.findByCategory(category);
	}
	
	@Override
	public List<FoodItem> findItemWithinPrice(float price) {
		return repo.findItemInPriceRange(price);
	}
	
}
