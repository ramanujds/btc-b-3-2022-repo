package com.springboot.foodieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.foodieapp.model.RecipeDetails;

@Service
public class RecipeServiceImpl {
	
	@Value("${RECIPE_API_URL}")
	private String recipeUrl;
	
	@Autowired
	RestTemplate rt;

	public RecipeDetails getRecipeDetails(String itemName) {
		return rt.getForObject(recipeUrl+itemName, RecipeDetails.class);
	}
	
}
