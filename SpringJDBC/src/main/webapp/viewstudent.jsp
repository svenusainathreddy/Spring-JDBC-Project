<%@ page language="java" contentType="text/html;
charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="#fcf7ee">
	<div
		style="margin: auto; width: 50%; border: 1px solid green; padding: 10px;">
		<h1>Employees List</h1>
		<table border="1" width="100%" cellpadding="2">
			<tr>
				<th>Student Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Phone</th>
				<th>Email Id</th>
				<th>Passed out Year</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="s" items="${l}">
				<tr>
					<td>${s.sid}</td>
					<td>${s.firstname}</td>
					<td>${s.lastname}</td>
					<td>${s.age}</td>
					<td>${s.phone}</td>
					<td>${s.emailid}</td>
					<td>${s.passedout}</td>
					<td><a href="editstudent/${s.sid}">Edit</a></td>
					<td><a href="deletestudent/${s.sid}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <a href="studentform">Add New Student</a>
	</div>
</body>