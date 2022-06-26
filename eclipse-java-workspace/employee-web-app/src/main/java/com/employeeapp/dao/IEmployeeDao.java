package com.employeeapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.employeeapp.model.Employee;

public interface IEmployeeDao {

	public Employee saveEmployee(Employee employee) throws SQLException ;
	
	public Employee findEmployee(int employeeId) throws SQLException ;
	
	public List<Employee> getAllEmployees() throws SQLException ;
	
	public boolean deleteEmployeeById(int employeeId) throws SQLException ;

}
