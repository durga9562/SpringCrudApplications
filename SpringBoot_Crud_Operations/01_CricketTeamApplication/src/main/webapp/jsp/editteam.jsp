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
	<h3>Edit Book</h3>
	<form:form action="editTeam" modelAttribute="team" method="post">

		<table>
			<tr>
				<form:hidden path="tid" />
			
		
				<td><from:input path="tid"/></td>
			
				<tr>
				<td>Team Name :</td>
				<td><form:input path="tname" /></td>

			</tr>

			<tr>
				<td>TeamCountry :</td>
				<td><form:input path="tcountry" /></td>

			</tr>
<tr>
				<td>TeamLanguage:</td>
				<td><form:input path="tlanguage" /></td>

			</tr>
			<%-- <tr>
				<td>Book Price :</td>
				<td><form:input path="bprice" /></td>

			</tr> --%>
			<tr>
				<td><input type="submit" value="Edit Save" /></td>

			</tr>
		</table>






	</form:form>

</body>
</html>