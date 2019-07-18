<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html xmlns:h="http://java.sun.com/jsf/html" 
 xmlns:p="http://primefaces.org/ui"
      xmlns:f="http://java.sun.com/jsf/core"
>
<head>
<meta charset="ISO-8859-1">
<title>Register Pigs</title>
</head>
<body>
<form action="addPig" method="post">
		
	<table>
			<tr>
				<td><h2>Register Pigs</h2></td>
			</tr>
			
			<tr>
				<td> Tag No:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td> DoB:</td>
				<td><input type="date" name="description" /></td>
			</tr>
			
			<tr>
				<td> Weight:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td> Sex:</td>				
				<td><input type="radio" name="gender" value="male"> Male<br>
                <input type="radio" name="gender" value="female"> Female</td>
			</tr>
            		
			<tr>
				<td> Race:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td> Category:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td> Piggery House:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			
            <tr>
				<td> Province:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td> District:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td> Sector:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td> Cell:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td> Village:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>			
			<td></td>
				<td><input type="submit" value="Add" /></td>		
			</tr>
			
	</table>
			
</form>
</body>
</html>