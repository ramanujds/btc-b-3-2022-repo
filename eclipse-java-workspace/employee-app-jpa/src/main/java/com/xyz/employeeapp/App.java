package com.xyz.employeeapp;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
    	
//    	Employee emp = new Employee(5001,"Javed Ali", LocalDate.of(2021, 10, 15), 54000);
//    	
//    	trnx.begin();
//    	emgr.persist(emp);
//    	trnx.commit();
    	
    	// Fetch Employee
    	
    	Employee emp = emgr.find(Employee.class, 5001);
    	System.out.println(emp);
    	
    }
}
