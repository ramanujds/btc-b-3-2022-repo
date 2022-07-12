package com.springboot.foodieapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.foodieapp.exception.ItemNotFoundException;

@SpringBootTest
class FoodItemServiceImplTest {
	
	@Autowired
	FoodItemService service;

	@Test
	void testSaveFoodItem() {
		
	}

	@Test
	void testFindFoodItem() {
		
		assertNotNull(service.findFoodItem(1001));
		assertThrows(ItemNotFoundException.class, ()-> service.findFoodItem(1000));
	}

	@Test
	void testUpdateFoodItem() {
		
	}

	@Test
	void testDeleteFoodItem() {
		
	}

	@Test
	void testGetAllItems() {
		
	}

	@Test
	void testGetItemByItemName() {
		
	}

	@Test
	void testFindItemsByCategory() {
		
	}

	@Test
	void testFindItemWithinPrice() {
		
	}

}
