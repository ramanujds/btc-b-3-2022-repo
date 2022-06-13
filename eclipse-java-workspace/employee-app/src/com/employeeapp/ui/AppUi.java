package com.employeeapp.ui;

import com.employeeapp.model.Employee;
import com.employeeapp.service.EmployeeServiceImpl;
import com.employeeapp.service.IEmployeeService;

public class AppUi {

	private IEmployeeService service;
	
	public AppUi() {
		service  = new EmployeeServiceImpl();
	}
	
	public void addEmployee() {
		System.out.println("Enter Employee Deatisl : ");
		System.out.println("Employee ID : ");
		// code to read the value
		// ..
		// ..
		
		Employee emp = new Employee(1001, "Harsh", 72000);
		service.saveEmployee(emp);
		
	}
	
	public void searchEmployee() {
		System.out.println("Enter the employee id to search for : ");
		
		int id = 0; // read id
		
		Employee employee = service.findEmployee(id);
		
		
		
	}
	
}
