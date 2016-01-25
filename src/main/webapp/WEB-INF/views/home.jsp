<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
		<h1>
			Hello world!  
		</h1>
		
		 <ol class="plan-list">
		 	<c:forEach var="plan" items="${plans}">
		 		<li>
		 			<span>
		 				<c:out value="${plan.name}" />
		 				<c:out value="${plan.costExpect}" />
		 				<small><c:out value="${plan.dateReg}" /></small>
		 			</span>
		 	</c:forEach>
		 </ol>
	</body>
</html>
