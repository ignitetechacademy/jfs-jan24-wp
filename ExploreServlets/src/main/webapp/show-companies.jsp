<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Collection, com.ignite.explore.servlets.companies.Company"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<script>
		function askConfirmation(){
			confirm(' Please confirm');
		}
	</script>

</head>
<body>

	<h2>List of Companies using JSP</h2>
	
	<a href="/ExploreServlets">HOME PAGE</><br><br><br>

	<table border="1">
		<thead>
			<tr>
				<td>Name</td>
				<td>Chief Executive Officer</td>
				<td></td>
				<td></td>
			</tr>
		</thead>
		
		<tbody>
		<%
		Collection<Company> companies = (Collection<Company>) request.getAttribute("comdata");
		
		for(Company com : companies){

			%>
			<tr>
				<td><%=com.getName() %></td>
				<td><%=com.getCeo() %></td>
				<td><a href="/ExploreServlets/update?cid=<%=com.getId() %>" />Update</a></td>
				<td><a href="/ExploreServlets/delete?cid=<%=com.getId() %>" onclick="askConfirmation()"/>Delete</a></td>
			</tr>
			<%
		}
		%>
		</tbody>
	</table>
</body>
</html>