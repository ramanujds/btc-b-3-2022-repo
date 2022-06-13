package com.employeeapp.service;

import java.util.List;

import com.employeeapp.dao.EmployeeDaoImpl;
import com.employeeapp.dao.IEmployeeDao;
import com.employeeapp.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	
	private IEmployeeDao dao;
	
	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
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
