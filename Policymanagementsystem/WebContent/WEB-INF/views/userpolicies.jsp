<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<table border="1" class="table">
<h1 class="policydet">View Policies</h1>
<tr>
<th>Policy Id</th>
<th>Policy Name</th>
<th>Policy Type</th>
<th>Policy Duration</th>
<th>Policy Amount</th>
<th>Company Name</th>
<th>Payment</th>
</tr>
<c:forEach items="${searchbyname}"  var="p">
<tr>
<td>${p.policyid}</td>
<td>${p.policyname}</td>
<td>${p.policytype}</td>
<td>${p.policyduration}</td>
<td>${p.policyamount}</td>
<td>${p.companyname}</td>
<td><a href="pay?policyid=${p.policyid}" class="link">Payment</a></td>
</tr>
</c:forEach>
<c:forEach items="${searchbytype}"  var="p">
<tr>
<td>${p.policyid}</td>
<td>${p.policyname}</td>
<td>${p.policytype}</td>
<td>${p.policyduration}</td>
<td>${p.policyamount}</td>
<td>${p.companyname}</td>
<td><a href="pay?policyid=${p.policyid}" class="link">Payment</a></td>
</tr>
</c:forEach>
<c:forEach items="${searchbyid}"  var="p">
<tr>
<td>${p.policyid}</td>
<td>${p.policyname}</td>
<td>${p.policytype}</td>
<td>${p.policyduration}</td>
<td>${p.policyamount}</td>
<td>${p.companyname}</td>
<td><a href="pay?policyid=${p.policyid}" class="link">Payment</a></td>
</tr>
</c:forEach>
<c:forEach items="${searchbycname}"  var="p">
<tr>
<td>${p.policyid}</td>
<td>${p.policyname}</td>
<td>${p.policytype}</td>
<td>${p.policyduration}</td>
<td>${p.policyamount}</td>
<td>${p.companyname}</td>
<td><a href="pay?policyid=${p.policyid}" class="link">Payment</a></td>
</tr>
</c:forEach>
<c:forEach items="${searchbytime}"  var="p">
<tr>
<td>${p.policyid}</td>
<td>${p.policyname}</td>
<td>${p.policytype}</td>
<td>${p.policyduration}</td>
<td>${p.policyamount}</td>
<td>${p.companyname}</td>
<td><a href="pay?policyid=${p.policyid}" class="link">Payment</a></td>
</tr>
</c:forEach>
<c:forEach items="${search}"  var="p">
<tr>
<td>${p.policyid}</td>
<td>${p.policyname}</td>
<td>${p.policytype}</td>
<td>${p.policyduration}</td>
<td>${p.policyamount}</td>
<td>${p.companyname}</td>
<td><a href="pay?policyid=${p.policyid}" class="link">Payment</a></td>
</tr>
</c:forEach>
<c:forEach items="${searchbyamount}"  var="p">
<tr>
<td>${p.policyid}</td>
<td>${p.policyname}</td>
<td>${p.policytype}</td>
<td>${p.policyduration}</td>
<td>${p.policyamount}</td>
<td>${p.companyname}</td>
</tr>
</c:forEach>
</table>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>