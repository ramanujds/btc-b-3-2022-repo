<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Spring Boot App</h1>
<h2>Person Form : </h2>
<form action="add-person" method="post">
<p>Enter name : <input type="text" name="personName"></p>
<p>Enter City : <input type="text" name="city"></p>
<p>Enter age : <input type="number" name="age"></p>
<button type="submit">Enter</button>

</form>

<div>
<form action="search-person" method="get">
Enter name : <input type="text" name="pname">
<button type="submit">Search</button>

</form>


</div>

</body>
</html>