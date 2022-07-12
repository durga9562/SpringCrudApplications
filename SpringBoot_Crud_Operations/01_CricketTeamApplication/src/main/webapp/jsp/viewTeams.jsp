<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<!-- //cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css
 -->
<link
	href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">
<script>
	$(document).ready(function() {
		$('#stutab').DataTable({
			"pagingType" : "full_numbers"
		});
	});
</script>
<script>
	function deleteConfirm() {
		var c = confirm("Are you sure, you want to delete?")
		console.log(c);
		return c;
	}
</script>
</head>

<body>
	<!-- <form:form action="viewTeams" modelAttribute="team" method="post">  -->
	<h3>View Books</h3>
	<a href="loadForm">Add New Book</a>
	<table id="stutab" border="1">
		<thead>
			<tr style="color:violet";>
				<th>TeamId</th>
				<th>TeamName</th>
				<th>TeamCountry</th>
				<th>TeamLanguage</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${teams}" var="b">
				<tr>
					<td>${b.tid}</td>

					<td>${b.tname}</td>
					<td>${b.tcountry}</td>
					<td>${b.tlanguage}</td>
					
					<td><a href="editteam?id=${b.tid}">Edit</a></td>
					<td><a href="deleteTeam?id=${b.tid}" onclick="deleteConfirm()">Delete</a>
				</tr>
			</c:forEach>

		</tbody>

	</table>
	<!-- </form:form> -->
</body>
</html>