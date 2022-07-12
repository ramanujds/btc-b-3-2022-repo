package com.springboot.foodieapp.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.foodieapp.exception.ItemNotFoundException;
import com.springboot.foodieapp.model.FoodItem;
import com.springboot.foodieapp.model.ItemCategory;
import com.springboot.foodieapp.model.RecipeDetails;
import com.springboot.foodieapp.repository.IFoodItemRepo;

@Service
public class FoodItemServiceImpl implements FoodItemService{
	
	
	@Autowired
	private IFoodItemRepo repo;
	
	@Autowired
	RecipeServiceImpl recipeService;
	
	private RecipeDetails recipe;
	
	@Override
	@Transactional
	public FoodItem saveFoodItem(FoodItem item) {
		FoodItem savedItem = repo.save(item);
		recipe = recipeService.getRecipeDetails(savedItem.getItemName());
		savedItem.setRecipe(recipe);
		return savedItem;
	}

	@Override
	public FoodItem findFoodItem(long itemCode) {
		if(!repo.existsById(itemCode)) {
			throw new ItemNotFoundException("Item with code - "+itemCode+" Not Found!!");
		}
		FoodItem item = repo.findById(itemCode).get();
		item.setRecipe(recipe);
		return item;
	}

	@Override
	@Transactional
	public FoodItem updateFoodItem(FoodItem item) {
		FoodItem savedItem = repo.save(item);
		recipe = recipeService.getRecipeDetails(savedItem.getItemName());
		savedItem.setRecipe(recipe);
		return savedItem;
	}

	@Override
	@Transactional
	public boolean deleteFoodItem(long itemCode) {
		 repo.deleteById(itemCode);
		 return !repo.existsById(itemCode);
	}

	@Override
	public List<FoodItem> getAllItems() {
		List<FoodItem> allItems = repo.findAll();
		allItems.forEach(item->{
			RecipeDetails recipe = recipeService.getRecipeDetails(item.getItemName());
			item.setRecipe(recipe);
					
		});
		return allItems;
		
	}

	@Override
	public FoodItem getItemByItemName(String itemName) {
		FoodItem item = repo.findByItemName(itemName);
		RecipeDetails recipe = recipeService.getRecipeDetails(item.getItemName());
		item.setRecipe(recipe);
		return item;
	}
	
	@Override
	public List<FoodItem> findItemsByCategory(ItemCategory category) {
		 
		List<FoodItem> allItems = repo.findByCategory(category);
		allItems.forEach(item->{
			RecipeDetails recipe = recipeService.getRecipeDetails(item.getItemName());
			item.setRecipe(recipe);
					
		});
		return allItems;
	}
	
	@Override
	public List<FoodItem> findItemWithinPrice(float price) {
		List<FoodItem> allItems = repo.findItemInPriceRange(price);
		allItems.forEach(item->{
			RecipeDetails recipe = recipeService.getRecipeDetails(item.getItemName());
			item.setRecipe(recipe);
					
		});
		return allItems;
	}
	
}
