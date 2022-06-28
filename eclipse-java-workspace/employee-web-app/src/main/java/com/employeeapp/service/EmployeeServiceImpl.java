package com.employeeapp.service;

import java.sql.SQLException;
import java.util.List;

import com.employeeapp.dao.EmployeeDaoImpl;
import com.employeeapp.dao.EmployeeDaoJDBCImpl;
import com.employeeapp.dao.EmployeeDaoJpa;
import com.employeeapp.dao.IEmployeeDao;
import com.employeeapp.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	
	private IEmployeeDao dao;
	
	public EmployeeServiceImpl() {
		dao = new EmployeeDaoJpa();
	}

	@Override
	public Employee saveEmployee(Employee employee) throws SQLException {
		return dao.saveEmployee(employee);
	}

	@Override
	public Employee findEmployee(int employeeId)throws SQLException  {
		
		return dao.findEmployee(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		return dao.getAllEmployees();
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) throws SQLException {
		return dao.deleteEmployeeById(employeeId);
	}

	
	
}
