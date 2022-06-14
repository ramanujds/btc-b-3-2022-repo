package com.xyz.collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapsExample {

	public static void main(String[] args) {
		
//		Map<Integer, String> numWordMap = new HashMap<>();
//		numWordMap.put(1, "One");
//		numWordMap.put(2, "Two");
//		numWordMap.put(3, "Three");
//		numWordMap.put(4, "Four");
//		numWordMap.put(5, "Five");
//		numWordMap.put(6, "Six");
//		numWordMap.put(7, "Seven");
//		numWordMap.put(8, "Eight");
//		numWordMap.put(9, "Nine");
//		numWordMap.put(0, "Zero");
//
//		
////		String word = numWordMap.get(5);
////		System.out.println(word);
//		
//		for(int key:numWordMap.keySet()) {
//			System.out.println(key+" : "+numWordMap.get(key));
//		}
		
		
		Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee(1001, "Rohit", 42000);
		Employee e2 = new Employee(1002, "Mohit", 38900);
		Employee e3 = new Employee(1005, "Priya", 43200);
		Employee e4 = new Employee(1003, "Suraj", 38900);
		Employee e5 = new Employee(1004, "Anil", 62900);
		
		employees.put(e1.getEmployeeId(), e1);
		employees.put(e2.getEmployeeId(), e2);
		employees.put(e3.getEmployeeId(), e3);
		employees.put(e4.getEmployeeId(), e4);
		employees.put(e5.getEmployeeId(), e5);
		
		
		// Searing fon an employee using key
		
//		int id = 1005;
//		
//		Employee employee=employees.get(id);
//		System.out.println(employee);
		
		// printing all the employees
		
//		for(int id:employees.keySet()) {
//			System.out.println(employees.get(id));
//		}
		
		employees.forEach((k,v)->System.out.println(v.getEmployeeId()));
		
	}
	
}
