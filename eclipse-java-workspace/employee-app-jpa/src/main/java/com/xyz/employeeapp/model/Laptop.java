package com.xyz.employeeapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Laptop {

	@Id
	private String serial;
	private String brand;
	private int storage;
	
	
}
