package com.employeewebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/hello")
public class AppController extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String name = "Mr./Ms. "+request.getParameter("tname");
		
		// request.setAttribute("username", name);
		
		ServletContext context = request.getServletContext();
		context.setAttribute("username", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("login", "manish@yahoo.com");
		session.setMaxInactiveInterval(60);
		
		rd.forward(request, response);

//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Hello-World</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h2>");
//		out.println("Hello " + name);
//		out.println("</h2>");
//		out.println("</body>");
//		out.println("</html>");
	}

}
