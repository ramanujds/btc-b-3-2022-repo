package com.employeeapp.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.employeeapp.model.Employee;

public class EmployeeDaoJpa implements IEmployeeDao {
	
	EntityManagerFactory factory;
	
	EntityManager emgr;
	
	EntityTransaction trnx ;
	
	public EmployeeDaoJpa() {
		factory = Persistence.createEntityManagerFactory("employee-persistence");
    	
    	emgr = factory.createEntityManager();
    	
    	trnx = emgr.getTransaction();
	}

	@Override
	public Employee saveEmployee(Employee employee) throws SQLException {
		emgr.persist(employee);
		return employee;
	}

	@Override
	public Employee findEmployee(int employeeId) throws SQLException {
		return emgr.find(Employee.class, employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
    	Query query1 = emgr.createQuery("from Employee");
    	List<Employee> employeeList = query1.getResultList();
    	 return employeeList;
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) throws SQLException {
		Employee emp = emgr.find(Employee.class, employeeId);
    	trnx.begin();
    	emgr.remove(emp);
    	trnx.commit();
    	emp = emgr.find(Employee.class, employeeId);
    	return emp==null;
	}

	
	
}
