package com.springboot.foodieapp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class RecipeDetails {

	@JsonProperty("meals")
	private List<Recipe> recipes;
	
}
