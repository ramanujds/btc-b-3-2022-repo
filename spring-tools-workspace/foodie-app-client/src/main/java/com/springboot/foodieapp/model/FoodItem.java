package com.springboot.foodieapp.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {

	
	private long itemCode;
	private String itemName;
	private float price;
	private ItemCategory category;
	private RecipeDetails recipe;
	
}
