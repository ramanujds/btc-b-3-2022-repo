package com.employeeapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.model.Employee;
import com.employeeapp.service.EmployeeServiceImpl;
import com.employeeapp.service.IEmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/employee")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEmployeeService service;

	public void init(ServletConfig config) throws ServletException {
		service=new EmployeeServiceImpl();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("empid"));
		Employee employee=null;
		try {
			employee = service.findEmployee(id);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			// redirect to error page
		}
		System.out.println(employee);
		request.setAttribute("emp", employee);
		request.getRequestDispatcher("show-employee.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("empid"));
		String name = request.getParameter("empname");
		float salary = Float.parseFloat(request.getParameter("salary"));
		
		Employee emp = new Employee(id, name, salary);
		Employee employee=null;
		try {
			employee = service.saveEmployee(emp);
			request.setAttribute("emp", employee);
			request.getRequestDispatcher("show-employee.jsp").forward(request, response);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
