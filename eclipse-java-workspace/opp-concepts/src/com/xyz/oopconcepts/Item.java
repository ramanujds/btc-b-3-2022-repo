package com.xyz.oopconcepts;

public abstract class Item {

	private int id;
	private String itemName;
	private float price;

	public Item() {
		System.out.println("Default Constructor Invoked");
	}

	public Item(int id, String itemName, float price) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	//public abstract void showItemDetails();

	
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	

}
