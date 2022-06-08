package com.xyz.oopconcepts;

public class AppMain {

	public static void main(String[] args) {
		
		Item item1 = new Item(102111,"AC",45000);
		Item item2 = new Item(200145,"Phone",85000);
		
		Item []items = new Item[5];
		
		items[0] = item1;
		items[1] = item2;
		
		for(Item item:items) {
			if(item ==null) {
				break;
			}
			System.out.println(item);
		}
		
//		item1.setId(1000101);
//		item1.setItemName("Camera");
//		item1.setPrice(75000);
		
		// item1.showItemDetails();
		
//		System.out.println(item1);
		
		
		
		
	}

}
