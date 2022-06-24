
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.time.LocalDateTime" %>
<html>
<body>
<h2>Hello <span style="color:red"> <%=application.getAttribute("username")%></span> </h2>
<%
for(int i=1;i<=10;i++){
	out.println("<p>Hello : "+LocalDateTime.now()+"</p>");
}


%>

<%=getMessage()%>

<%!
public String getMessage(){
	return "Hey there, this is an example of JSP Declaration";
}

%>

<%-- <%=session.getAttribute("login") %> --%>

${login}

</body>
</html>
