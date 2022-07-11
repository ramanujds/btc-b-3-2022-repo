package com.springboot.foodieapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Recipe {

	@JsonProperty("idMeal")
	private long mealId;
	
	@JsonProperty("strMeal")
	private String itemName;
	
	@JsonProperty("strCategory")
	private String itemCategory;
	
	@JsonProperty("strArea")
	private String recipeStyle;
	
	@JsonProperty("strInstructions")
	private String recipeInstructions;
	
	@JsonProperty("strMealThumb")
	private String itemView;
	
	
	
}
