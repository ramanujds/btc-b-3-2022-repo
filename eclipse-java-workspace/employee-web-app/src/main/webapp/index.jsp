<%@ page errorPage="error.jsp" %>  
<html>
<body>
<h2>Add Employee : </h2>
<form action="employee" method="post">
Employee ID : <input type="text" name="empid">
Employee name : <input type="text" name="empname">
Salary : <input type="text" name="salary">
<button type="submit">Enter</button>
</form>

<h3>Search Employee</h3>
<form action="employee" method="get">
Employee ID : <input type="text" name="empid">
<button type="submit">Search</button>
</form>
</body>
</html>
