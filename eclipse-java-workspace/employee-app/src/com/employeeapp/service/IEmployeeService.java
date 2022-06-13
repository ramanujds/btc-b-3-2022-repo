package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;

public interface IEmployeeService {

	
public Employee saveEmployee(Employee employee);
	
	public Employee findEmployee(int employeeId);
	
	public List<Employee> getAllEmployees();
	
	public boolean deleteEmployeeById(int employeeId);
}
