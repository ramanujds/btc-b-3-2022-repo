package com.springboot.foodieapp.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FoodItem {

	@Id
	private long itemCode;
	private String itemName;
	private float price;
	@Enumerated
	private ItemCategory category;
	
}
