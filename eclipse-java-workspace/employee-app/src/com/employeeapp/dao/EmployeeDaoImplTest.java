package com.employeeapp.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.employeeapp.model.Employee;

class EmployeeDaoImplTest {

	IEmployeeDao dao;
	Employee emp;
	
	@BeforeEach
	public void init() {
		dao = new EmployeeDaoImpl();
		emp = new Employee(10001,"Alax",28000);
	}
	
	@Test
	void testSaveEmployee() {
		dao.saveEmployee(emp);
		assertTrue(EmployeeDaoImpl.employeeDb.containsValue(emp));
		assertEquals(emp, dao.findEmployee(emp.getEmployeeId()));
	}

	@Test
	void testFindEmployee() {
		dao.saveEmployee(emp);
		assertEquals(emp, dao.findEmployee(emp.getEmployeeId()));
	}

}
