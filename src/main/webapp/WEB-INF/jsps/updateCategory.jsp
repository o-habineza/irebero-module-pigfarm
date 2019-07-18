<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Category</title>
</head>
<body>
<h2>Update Category</h2>
</br>
<form action="edit" method="post">
		<pre>
			<table>
			<tr>
				<td>Id:</td>		
				<td><input type="text" name="categoryId" value="${category.categoryId}" readonly="true"/></td>				
			</tr>
			<tr>
				<td>Category Name:</td>
				<td><input type="text" name="description" value="${category.description}"/></td>				
			</tr>
		
			</br>
			<tr>
				<td><input type="submit" value="update" /></td>
			</tr>
			</table>
			</pre>
			</form>
			
			
		

</body>
</html>