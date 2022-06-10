package com.xyz.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionBasics {

	public static void main(String[] args) {
		
		List<String> items = new Stack<>();
		
		items.add("Rohan");
		items.add("Suraj");
		items.add("Harsh");
		items.add("Yash");

		
//		while(!items.isEmpty()) {
//			System.out.println(items.pop());
//		}
		
		
	
		
		for(String item:items) {
			System.out.println(item.toUpperCase());
		}
		

	}

}
