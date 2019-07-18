<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Category</title>
</head>
<body>
	<h2>Categories</h2>
	</br>
	<table border="1">	
	      <tr>
				<td>Category Description</td>
				<td>Operations</td>
			</tr>
		<c:forEach var="categories" items="${categories}" >
			<tr>
				<td>${categories.description}</td>
				<td><a href="delete?id=${categories.categoryId}"
				onclick="return confirm('Are you sure?')">Delete</a>
			       <a href="updt?id=${categories.categoryId}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	</br>
	<a href="showCat">Add Category</a>
</body>
</html>