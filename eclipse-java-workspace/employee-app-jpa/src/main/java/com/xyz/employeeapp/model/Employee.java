package com.xyz.employeeapp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "employee_db")
@NamedQuery(name = "findByName", query = "from Employee where employeeName=:employeeName")
@Data
@NoArgsConstructor
public class Employee {

	@Id
	private int id;
	@Column(name = "employee_name", unique = true)
	private String employeeName;
	private LocalDate dateJoined;
	private float salary;
	@OneToMany
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public Employee(int id, String employeeName, LocalDate dateJoined, float salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.dateJoined = dateJoined;
		this.salary = salary;
	}
	
	
}
