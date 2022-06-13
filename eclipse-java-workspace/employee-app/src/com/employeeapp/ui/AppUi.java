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
		Employee emp = new Employee(1001, "Harsh", 72000);
		service.saveEmployee(emp);
		
	}
	
}
