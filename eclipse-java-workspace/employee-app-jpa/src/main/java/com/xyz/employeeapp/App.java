package com.xyz.employeeapp;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xyz.employeeapp.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee-persistence");
    	
    	EntityManager emgr = factory.createEntityManager();
    	
    	EntityTransaction trnx = emgr.getTransaction();
    	
    	// Insert employee
    	
//    	Employee emp1 = new Employee(5002,"Suraj Kumar", LocalDate.of(2022, 02, 15), 36000);
//    	Employee emp2 = new Employee(5003,"Manish Sharma", LocalDate.of(2020, 12, 15), 36000);
//    	Employee emp3 = new Employee(5004,"Supriya Roy", LocalDate.of(2021, 10, 25), 36000);
//    	Employee emp4 = new Employee(5005,"Gaurav Dutta", LocalDate.of(2020, 04, 10), 36000);
//    	
//    	trnx.begin();
//    	emgr.persist(emp1);
//    	emgr.persist(emp2);
//    	emgr.persist(emp3);
//    	emgr.persist(emp4);
//    	trnx.commit();
    	
    	// Fetch Employee
    	
//    	Employee emp = emgr.find(Employee.class, 5003);
//    	System.out.println(emp);
    	
    	// Update Employee
    	
//    	trnx.begin();
//    	Employee emp = emgr.find(Employee.class, 5004);
//    	emp.setSalary(42000);
//    	trnx.commit();
    	
//    	Employee emp = new Employee(5003,"Manish Sharma", LocalDate.of(2019, 12, 15), 67000);
//    	trnx.begin();
//    	emgr.merge(emp);
//    	trnx.commit();
    	
    	// Delete Employee
    	
//    	Employee emp = emgr.find(Employee.class, 5003);
//    	trnx.begin();
//    	emgr.remove(emp);
//    	trnx.commit();
    	
    	// Fetch all the employees
    	
//    	Query query1 = emgr.createQuery("from Employee");
//    	
//    	List<Employee> employeeList = query1.getResultList();
//    	
//    	employeeList.forEach(e->System.out.println(e));
    	
    	// Fetch employees by name
    	
//    	String name = "Gaurav Dutta";
//    	Query searchByName = emgr.createQuery("from Employee where employeeName = :employeeName");
//    	searchByName.setParameter("employeeName", name);
//    	Employee emp = (Employee) searchByName.getSingleResult();
//    	
//    	System.out.println(emp);
   
    	
    }
}
