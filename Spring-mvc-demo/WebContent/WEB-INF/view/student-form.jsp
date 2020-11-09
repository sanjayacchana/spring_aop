<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Register Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br><br>
		
		Last Name: <form:input path="lastName"/>
		<br><br>
		
		Country: <form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		
		<%-- Country: <form:select path="country">
			<form:option value="India" label="India"></form:option>
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Britain" label="Britain"></form:option>
			<form:option value="SriLanka" label="SriLanka"></form:option>
			<form:option value="SouthAfrica" label="SouthAfrica"></form:option>
		</form:select> --%>
		
		<br><br>
		
		Favorite Language: <br>
		 <form:radiobutton path="favoriteLanguage" value="Java"/>Java <br>
		 <form:radiobutton path="favoriteLanguage" value="C#"/>C# <br>
		 <form:radiobutton path="favoriteLanguage" value="JS"/>JS <br>
		 <form:radiobutton path="favoriteLanguage" value="Python"/>Python <br>
		
		<br><br>
		
		Operating Systems: <br>
			<form:checkbox path="operatingSystems" value="Linux"/> Linux <br>
			<form:checkbox path="operatingSystems" value="Mac Os"/> Mac Os <br>
			<form:checkbox path="operatingSystems" value="Windows"/> Windows <br>
		
		<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>