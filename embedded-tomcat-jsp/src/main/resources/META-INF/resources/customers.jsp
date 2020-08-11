<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customers</title>

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

	<div class="container">
	
		<h3 class="mt-4">
			Customer Servlet Using JPA
		</h3>
		
		<div class="card">
		
			<div class="card-body">
				<c:url value="/customers" var="cust" ></c:url>
				<form action="${cust}" method="post" class="form">
					
					<div class="form-row">
						<div class="col-6">
							<div class="form-group">
								<label for="name">Name</label>
								<input type="text" id="name" name="name" required="required" class="form-control" />
							</div>
						</div>
					</div>
	
					<div class="form-row">
						<div class="col-6">
							<div class="form-group">
								<label for="phone">Phone</label>
								<input type="tel" id="phone" name="phone" required="required" class="form-control" />
							</div>
						</div>
						<div class="col-6">
							<div class="form-group">
								<label for="email">Email</label>
								<input type="email" id="email" name="email" required="required" class="form-control" />
							</div>
						</div>
					</div>
					
					<button class="btn btn-primary">Add New</button>
				</form>
			</div>
		</div>
		
		
		<table class="table mt-4">
			
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Phone</th>
					<th>Email</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${list}" var="c">
					<td>${c.id}</td>
					<td>${c.name}</td>
					<td>${c.phone}</td>
					<td>${c.email}</td>
				</c:forEach>
			</tbody>
		
		</table>
	</div>

</body>
</html>