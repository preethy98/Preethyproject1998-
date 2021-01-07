<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.link{padding-top:100px;border:activeborder;}
.th{color:white;}
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
<ul type="square">
<li><a class="policy" href="createform">CREATE POLICY</a></li>
<br>
<br>
<li><a class="policy" href="viewpolicy">VIEW POLICY</a></li>
</ul>
<br>
<br>
<h1 class="policydet">Policy Details</h1>
<c:out value="${errormsg}"/>
<table border="1" class="table">
<tr>
<th class="th">Policy Id</th>
<th class="th">Policy Name</th>
<th class="th">Policy Type</th>
<th class="th">Policy Duration</th>
<th class="th">Policy Amount</th>
<th class="th">Company Name</th>
<th class="th">Edit</th>
<th class="th">Delete</th>
</tr>
<c:forEach items="${policies}"  var="p">
<tr>
<td>${p.policyid}</td>
<td>${p.policyname}</td>
<td>${p.policytype}</td>
<td>${p.policyduration}</td>
<td>${p.policyamount}</td>
<td>${p.companyname}</td>
<td><a href="edit?policyid=${p.policyid}" class="link">edit</a></td>
<td><a href="delete?policyid=${p.policyid}" class="link">delete</a></td>
</tr>
</c:forEach>
</table>
<input type="button" onclick="location.href='http://localhost:9090/Policymanagementsystem/';" value="Logout" id="#cancel">
</body>
<br>
<br>
<br>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>