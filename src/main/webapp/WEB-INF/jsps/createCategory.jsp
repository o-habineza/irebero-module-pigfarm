<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Category</title>
</head>
<body>
<form action="addCat" method="post">
		
	<table>
			<tr>
				<td><h2>Register Category</h2></td>
			</tr>
			
			<tr>
				<td>Category Name:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
			<td></td>
				<td><input type="submit" value="Add" /></td>
				</br>
				${msg}
			</tr>
			
	</table>
			
</form>
</body>
</html>