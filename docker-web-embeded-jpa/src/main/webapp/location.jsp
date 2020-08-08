<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Locations of Myanmar</title>

<link rel="stylesheet" href="resources/bootstrap.min.css" />

<script type="text/javascript" src="resources/jquery.min.js"></script>
<script type="text/javascript" src="resources/popper.min.js"></script>
<script type="text/javascript" src="resources/bootstrap.min.js"></script>

</head>
<body>

	<div class="container mt-3">
		
		<div class="jumbotron">
			<h1>Myanmar Locations</h1>
			<p>Tutorial Project for Docker Container using embedded Database, JPA and Servlet, JSP.</p>
		</div>
		
		<div class="row">
			
			<div class="col-4">
			
				<h3>Divisions</h3>
				<div class="list-group">
									
					<c:forEach items="${divisions}" var="d">
						<c:url value="/locations" var="showTownship" >
							<c:param name="id" value="${d.id}"></c:param>
						</c:url>
						<a href="${showTownship}" class="list-group-item list-group-item-action ${d.id eq division.id ? 'active' : ''}">
							${d.name}
						</a>
					</c:forEach>
				</div>
			</div>
			
			<div class="col-8">
				<h3>${division.name}</h3>
				<c:forEach items="${townships}" varStatus="status" step="2">
					<div class="row mb-4">
						<div class="col-6">
							<div class="card">
								<div class="card-body">
									${townships[status.index].name}
								</div>
							</div>						
						</div>
						<c:if test="${not empty townships[status.index + 1]}">
							<div class="col-6">
								<div class="card">
									<div class="card-body">
										${townships[status.index + 1].name}
									</div>
								</div>						
							</div>
						</c:if>
					</div>
				</c:forEach>
			
			</div>
		
		</div>
	
	</div>

</body>
</html>