package com.employeeapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.employeeapp.model.Employee;
import com.employeeapp.util.DbConnectionUtil;

@Component("dao-jdbc")
public class EmployeeDaoJDBCImpl implements IEmployeeDao{
	private Connection conn = null;
	private PreparedStatement psmt=null;
	private ResultSet queryResult=null;

	@Override
	public Employee saveEmployee(Employee employee) throws SQLException {
		conn = DbConnectionUtil.getConnection();
		psmt = conn.prepareStatement("insert into emp_db values(?,?,?)");
		psmt.setInt(1, employee.getEmployeeId());
		psmt.setString(2, employee.getEmployeeName());
		psmt.setFloat(3, employee.getSalary());
		int rowCount = psmt.executeUpdate();
		DbConnectionUtil.closeDbConnection();
		if(rowCount!=0) {
			return employee;
		}
		return null;
	}

	@Override
	public Employee findEmployee(int employeeId) throws SQLException {
		conn = DbConnectionUtil.getConnection();
		psmt = conn.prepareStatement("select * from emp_db where id=?");
		psmt.setInt(1, employeeId);
		queryResult = psmt.executeQuery();
		if(queryResult.next()) {
			Employee emp = new Employee();
			emp.setEmployeeId(employeeId);
			emp.setEmployeeName(queryResult.getString("employee_name"));
			emp.setSalary(queryResult.getFloat("salary"));
			return emp;
		}
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
