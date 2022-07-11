<%@page import="com.springboot.foodieapp.model.FoodItem"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
FoodItem item =(FoodItem) request.getAttribute("item");
%>

<p>Name : ${item.itemName}</p>
<p>Code : ${item.itemCode}</p>
<p>Price : ${item.price}</p>
<p>Veg/NonVeg : ${item.category}</p>
<p>Meal ID : ${item.recipe.recipes.get(0).mealId}</p>
<p>Item Category : ${item.recipe.recipes.get(0).itemCategory}</p>
<p>Recipe Style : ${item.recipe.recipes.get(0).recipeStyle}</p>
<p>Instructions : ${item.recipe.recipes.get(0).recipeInstructions}</p> 
<div>

<img alt="No Image available" src="${item.recipe.recipes.get(0).itemView}" height="300px" width="300px">
</div>

</body>
</html>