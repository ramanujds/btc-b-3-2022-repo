package com.xyz.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompareBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
}

class CompareByName implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmployeeName().compareTo(e2.getEmployeeName());
	}
}

public class CollectionSorting {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		Employee e1 = new Employee(1001, "Rohit", 42000);
		Employee e2 = new Employee(1002, "Mohit", 38900);
		Employee e3 = new Employee(1005, "Priya", 43200);
		Employee e4 = new Employee(1003, "Suraj", 38900);
		Employee e5 = new Employee(1004, "Anil", 62900);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		Comparator<Employee> compareBySalary = new CompareBySalary();
		Comparator<Employee> compareByName = new CompareByName();

//		Comparator<Employee> compareById = new Comparator<Employee>() {
//			public int compare(Employee e1, Employee e2) {
//				return e1.getEmployeeId() - e2.getEmployeeId();
//			}
//		};
		
		Comparator<Employee> compareById = (emp1,emp2) -> emp1.getEmployeeId() - emp2.getEmployeeId();

		Collections.sort(employeeList, compareById);

		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

	}

}
