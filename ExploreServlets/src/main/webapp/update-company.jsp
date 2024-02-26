<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.ignite.explore.servlets.companies.Company"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Update Company Data</h2>

	<%!Company company;%>
	
	<%
	company = (Company) request.getAttribute("comData");
	%>
	
	<form method="post" action="update">
		Company Id<input type="hidden" value="<%=company.getId() %>" name="comId">
		<br>
		Company Name<input type="text" value="<%=company.getName() %>" disabled="disabled">
		<br> 
		CEO Name <input type="text" value="<%=company.getCeo() %>" name="newCEOName"><br>
		<input type="submit" value="Update CEO">
	</form>


</body>
</html>