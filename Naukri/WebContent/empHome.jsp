<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
out.println("Hi..!!"+session.getAttribute("empname"));

%>

<h1><a href="/Naukri/jobDetails.html">Wanna post job?</a></br></h1>
<h1><a href="/Naukri/EmpLogout">Logout?</a></br></h1>


</body>
</html>