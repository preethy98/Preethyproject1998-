<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
td.right{text-align: right;}
</style>
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
<form action="userlogin" method="post">
<table class="table">
<tr>
<h3 class="policydet">LOGIN FORM</h3>
<td>
UserId</td><td><input type="text" name="usersid" /></td></tr><tr>
<td>Password</td><td><input type="password" name="passwords"/></td></tr><tr><td>
<input type="submit" value="login" id="userloginaccess"></td><td><input type="button" class="right" onclick="location.href='http://localhost:9090/Policymanagementsystem/';" value="Cancel" id="">
</td></tr></table>
</form>
<c:out value="${emsg}"/>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>