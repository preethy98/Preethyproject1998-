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
<form action="adminlogin" method="post">
<table  class="table">
<tr>
<h3 class="policydet">LOGIN FORM</h3>
<td>AdminId</td>
<td><input type="text" name="adminsid"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="passwords"/></td>
</tr>
<tr>
<td><input type="submit" value="login" id="adminloginaccess"></td><td><input type="button" onclick="location.href='http://localhost:9090/Policymanagementsystem/';" value="Cancel" id="admincancellogin">
</td>
</tr>
</table>
</form>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>