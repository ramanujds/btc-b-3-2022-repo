package com.xyz.collectionframework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class SetBasics {

	public static void main(String[] args) {
		
//		Set<String> names = new TreeSet<>();
//		
//		names.add("Gaurav");
//		names.add("Sunil");
//		names.add("Javed");
//		names.add("Harsh");
//		names.add("Sunil");
//		
//		
//		System.out.println(names);
		
		Set<Employee> employees = new HashSet<Employee>();
		
		Employee e1 = new Employee(1001, "Rohit", 42000);
		Employee e2 = new Employee(1002, "Mohit", 38900);
		Employee e3 = e1;
		Employee e4 = new Employee(1003, "Suraj", 38900);
		Employee e5 = new Employee(1003, "Suraj", 38900);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		for(Employee emp:employees) {
			System.out.println(emp);
		}
		
		
	}
	
}
