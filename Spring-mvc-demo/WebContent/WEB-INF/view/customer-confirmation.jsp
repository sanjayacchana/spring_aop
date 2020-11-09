<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation Page</title>
</head>
<body>
	The Customer is Confirmed: ${customer.firstName} ${customer.lastName}
	<br>
	Free Pases: ${customer.freePases}
	<br>
	Postal Code : ${customer.postalCode }
	<br>
	Course Code: ${customer.courseCode}
</body>
</html>