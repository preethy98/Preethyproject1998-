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
<h1 style="color:purple;" class="head">Welcome User</h1>
<h3 style="color:green;" class="head">PaymentModes</h3>
<c:out value="${pid}"/>
<form action="paymode" method="post">
<input type="hidden" name="policyid" value="${pid}">
<table class="table">
<tr>
<td>Credit/Debit</td><td><input type="radio" id="mode" value="creditdebit" name="mode"></td>
</tr>
<tr>
<td>GooglePay</td><td><input type="radio" id="mode" value="googlepay" name="mode"></td>
</tr>
<tr>
<td>NetBanking</td><td><input type="radio" id="mode" value="netbanking" name="mode"></td>
</tr>
<tr>
<td><input type="submit" value="PAY"></td></tr>
</table>
</form>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>