<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>Add Book</h3>
		<p>${msg}</p>
		<form:form action="addTeam" modelAttribute="team" method="post">

			<table border="3" style="color: violet";>
				<tr>
					<td>Team Id :</td>
					<td><form:input path="tid" /></td>

				</tr>
				<tr>
					<td>Team Name :</td>
					<td><form:input path="tname" /></td>

				</tr>

				<tr>
					<td>Team Country :</td>
					<td><form:input path="tcountry" /></td>

				</tr>

				<tr>
					<td>Team Language :</td>
					<td><form:input path="tlanguage" /></td>

				</tr>

				
				<tr>
					<td><input type="reset" value="ClearTheForm"></td>
					<td><input type="submit" value="Add Book"></td>
				</tr>
			</table>






		</form:form>

		<a href="viewTeams">ViewAllBooks</a>
	</center>
</body>
</html>