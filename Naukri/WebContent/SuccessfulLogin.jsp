<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successfully Logged in</title>
</head>
<body>

<%
out.println("Hi..!!"+session.getAttribute("sname"));
%>
<a href="/Naukri/SearchJob"> Search Job</a>
</body>
</html>