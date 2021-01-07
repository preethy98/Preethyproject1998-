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
<h1 class="successmsg">Your Transaction is Successful</h1><br>
<h3>Your Transaction id:12154211452142</h3><br>
<h3>Payment Date :05-01-2021</h3><br>
<h3>Payment Amount:5000</h3><br>
<h4 class="successmsg">Thank you for using Google pay,a reward is generated</h4>
<input type="button" onclick="location.href='http://localhost:9090/Policymanagementsystem/';" value="Logout" id="#cancel">
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>