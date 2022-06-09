package com.xyz.employeeapp;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1001, "Rohit", 42000);
		Employee e2 = new Employee(1002, "Mohit", 38900);
		Employee e3 = e1;
		Employee e4 = new Employee(1002, "Suraj", 38900);
		
		
		System.out.println(e2.equals(e4));
		
		

	}

}
