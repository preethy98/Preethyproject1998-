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
<h2 style="color:green;" class="head" >Payment Status</h2>
<table border="1" class="table">
<tr>
<th>Policy Id</th>
<th>Bill Date</th>
<th>Payment Amount</th>
<th>Due Date</th>
<th>Status</th>
<th>Fine</th>
<th>Payment</th>
</tr>
<tr>
<td>${payment.policyid}</td>
<td>${payment.billdate}</td>
<td>${payment.paymentamount}</td>
<td>${payment.duedate}</td>
<td>${payment.status}</td>
<td>${payment.fine}</td>
<td><a href="paynow?id=${payment.policyid}" class="link">PayNow</a></td>
</tr>
</table>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>