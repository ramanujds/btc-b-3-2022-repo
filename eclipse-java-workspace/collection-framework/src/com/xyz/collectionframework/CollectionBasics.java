package com.xyz.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

class CompareReverse implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}

public class CollectionBasics {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		
		items.add("Rohan");
		items.add("Suraj");
		items.add("Harsh");
		items.add("Yash");

		
//		while(!items.isEmpty()) {
//			System.out.println(items.pop());
//		}
		
		Collections.sort(items, new CompareReverse());
	
		
		for(String item:items) {
			System.out.println(item.toUpperCase());
		}
		
		//List<Employee> employees = new ArrayList<Employee>();
		
		
		

	}

}
