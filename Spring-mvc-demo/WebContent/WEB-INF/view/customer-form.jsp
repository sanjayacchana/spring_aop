<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
	<style>
		.error{
			color:red;
		}
	</style>
</head>
<body>
<i>Fill out the Form. Asterisk (*) means requried.</i>
	<form:form action="processForm" modelAttribute="customer">
	
		FirstName: <form:input path="firstName"/> <br><br>
		
		LastName(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors> <br><br>
		
		Free Pases: <form:input path="freePases"/>
		<form:errors path="freePases" cssClass="error"></form:errors> <br><br>
		
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"></form:errors> <br><br>
		
		Postal Code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"></form:errors> <br><br>
		
		<input type="submit" value="Submit">
		
	</form:form>

</body>
</html>