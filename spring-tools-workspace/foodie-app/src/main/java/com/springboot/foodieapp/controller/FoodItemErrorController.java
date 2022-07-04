package com.springboot.foodieapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springboot.foodieapp.exception.ItemNotFoundException;

@RestControllerAdvice
public class FoodItemErrorController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(ItemNotFoundException.class)
	public String handleItemNotFoundException(Exception ex) {
		return ex.getMessage();
	}
	
}
