package com.xyz.employeeapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_db")
public class Employee {

	@Id
	private int id;
	
	@Column(name = "employee_name", unique = true)
	private String employeeName;
	
	private LocalDate dateJoined;
	
	private float salary;
	
	public Employee() {
	}

	public Employee(int id, String employeeName, LocalDate dateJoined, float salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.dateJoined = dateJoined;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", dateJoined=" + dateJoined + ", salary="
				+ salary + "]";
	}
	
	
	
}
