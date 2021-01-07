<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbar.jsp" %>
<nav class="navbar">
<ul class="nav-items">
<div class="heading">
<li class="nav-item"><a href="view"><h3>Info</h3></a></li>
<li class="nav-item"><a href="mainpage"><h3>Home</h3></a></li>
</div>
</ul>
<br>
<br>
<br>
</nav>
<h3 style="color:green;">Your details are successfully Inserted.Please Check your details here....<br>
FirstName:${admin.firstname}<br>
LastName:${admin.lastname}<br>
Gender:${admin.gender}<br>
Age:${admin.age}<br>
AdminId:${admin.adminid}<br>
</h3>
<button onclick="location.href='http://localhost:9090/Policymanagementsystem/';" id="click">ok</button>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>