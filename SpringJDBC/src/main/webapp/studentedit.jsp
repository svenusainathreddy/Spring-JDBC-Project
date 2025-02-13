<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="#fcf7ee">
	<div
		style="margin: auto; width: 50%; border: 1px solid green; padding: 10px;">
		<h1>Edit Employee</h1>
		<form:form method="POST" action="/SpringJDBC/editsave">
			<table>
				<tr>
					<td></td>
					<td><form:hidden path="sid" /></td>
				</tr>
				<tr>
					<td>FirstName :</td>
					<td><form:input path="firstname" /></td>
				</tr>
				<tr>
					<td>LastName :</td>
					<td><form:input path="lastname" /></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td>Phone Number :</td>
					<td><form:input path="phone" /></td>
				</tr>
				<tr>
					<td>Email Id :</td>
					<td><form:input path="emailid" /></td>
				</tr>
				<tr>
					<td>Passed out Year :</td>
					<td><form:input path="passedout" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Edit Save" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
