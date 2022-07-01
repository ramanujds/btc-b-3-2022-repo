package com.springboot.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.foodieapp.model.FoodItem;
import com.springboot.foodieapp.repository.IFoodItemRepo;

@Service
public class FoodItemServiceImpl implements FoodItemService{

	@Autowired
	private IFoodItemRepo repo;
	
	@Override
	@Transactional
	public FoodItem saveFoodItem(FoodItem item) {
		return repo.saveFoodItem(item);
	}

	@Override
	public FoodItem findFoodItem(long itemCode) {
		return repo.findFoodItem(itemCode);
	}

	@Override
	@Transactional
	public FoodItem updateFoodItem(FoodItem item) {
		return repo.updateFoodItem(item);
	}

	@Override
	@Transactional
	public boolean deleteFoodItem(long itemCode) {
		return repo.deleteFoodItem(itemCode);
	}

	@Override
	public List<FoodItem> getAllItems() {
		return repo.getAllItems();
	}

	
	
	
}
