<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>All Students</title>
<style type="text/css">
</style>
</head>
<body>
	<div class="container">
	<hr>
		<div class="jumbotron">
			<h1>All Students</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>

		<table class="table table-striped">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${students}" var="student">
				<tr>
					<td><c:out value="${student.id}"></c:out></td>
					<td><c:out value="${student.name}"></c:out></td>
					<td><c:out value="${student.age}"></c:out></td>
					<td><a class="btn btn-success"
						href="./updateById?id=${student.id}">Update</a></td>
					<td><a class="btn btn-danger"
						href="./deleteById?id=${student.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>

		<a class="btn btn-primary" href="./addStudent">Add Student</a>
	</div>
</body>
</html>