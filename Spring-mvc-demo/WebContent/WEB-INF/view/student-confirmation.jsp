<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation page</title>
</head>
<body>
	<p> The Student got confirmed: ${student.firstName}  ${student.lastName} </p>
	<br>
	Country: ${student.country}
	<br>
	Student's Favorite Language is : ${student.favoriteLanguage}
	<br>
	Operating Systems:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}">
				<li> ${temp} </li>
			</c:forEach>
		</ul>
</body>
</html>