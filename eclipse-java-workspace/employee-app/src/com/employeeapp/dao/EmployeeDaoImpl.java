package com.employeeapp.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.employeeapp.model.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
	
	static Map<Integer, Employee> employeeDb = new HashMap<Integer, Employee>();

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
