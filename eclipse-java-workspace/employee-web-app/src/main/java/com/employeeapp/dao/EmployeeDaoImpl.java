package com.employeeapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.employeeapp.model.Employee;

@Component("dao-collection")
public class EmployeeDaoImpl implements IEmployeeDao {
	
	static Map<Integer, Employee> employeeDb = new HashMap<Integer, Employee>();

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDb.put(employee.getEmployeeId(), employee);
	}

	@Override
	public Employee findEmployee(int employeeId) {
		return employeeDb.get(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>(employeeDb.values());
		return employees;
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	String findEmployeeByName(String name) {
		return null;
	}

	
	
}
