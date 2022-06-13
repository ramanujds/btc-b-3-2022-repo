package com.xyz.collectionframework;

import java.util.Comparator;
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
		
		Comparator<Employee> compareById = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return e1.getEmployeeId() - e2.getEmployeeId();
		}
	};
		
		Set<Employee> employees = new TreeSet<Employee>(compareById);
		
		Employee e1 = new Employee(1001, "Rohit", 42000);
		Employee e2 = new Employee(1002, "Mohit", 38900);
		Employee e3 = new Employee(1005, "Priya", 43200);
		Employee e4 = new Employee(1003, "Suraj", 38900);
		Employee e5 = new Employee(1004, "Anil", 62900);
		
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
