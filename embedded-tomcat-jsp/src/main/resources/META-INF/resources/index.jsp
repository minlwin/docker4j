<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
	
	<c:url value="/resources/bootstrap.min.css" var="bootstrap_css"></c:url>
	<c:url value="/resources/jquery.min.js" var="jquery_js"></c:url>
	<c:url value="/resources/popper.min.css" var="popper_js"></c:url>
	<c:url value="/resources/bootstrap.min.js" var="bootstrap_js"></c:url>
	
	<link rel="stylesheet" href="${bootstrap_css}" />
	<script src="${jquery_js}"></script>
	<script src="${popper_js}"></script>
	<script src="${bootstrap_js}"></script>

</head>
<body>

	<div class="jumbotron m-4">
		<h1>Hello Embedded JSP</h1>
		
		<%= "Hello JSP -> " %>
		
		<c:import url="/current-time"></c:import>
		
		<br />
		
		<c:url value="/customers" var="cust"></c:url>
		<a href="${cust}" class="btn btn-primary">Customer Servlet</a>
	</div>
</body>
</html>