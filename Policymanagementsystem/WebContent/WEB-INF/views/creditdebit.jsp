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
<c:out value="${policyid}"/>
<h1 class="gpay" >Debit Transaction</h1>
<form action="gpay" method="post">
<input type="hidden" name="pid" value="${policyid}">
<table  class="table">
<tr><td>Enter Bankname</td>
<td><input type="text" name="bankname"/></td>
</tr>
<tr><td>Enter Name on Card</td>
<td><input type="text" name="bankname"/></td>
</tr>
<tr>
<td>Enter Card Number</td>
<td><input type="number" name="amount"/></td>
</tr>
<tr>
<td>Enter CVV Pin</td>
<td><input type="number" name="pinno"/></td>
</tr>
<tr>
<td>Enter Expiry date</td>
<td><input type="text" name="date"/></td>
</tr>
<tr>
<td><input type="submit" value="Go" id="adminloginaccess"></td><td><input type="button" onclick="location.href='http://localhost:9090/Policymanagementsystem/';" value="Cancel" id="admincancellogin">
</td>
</tr>
</table>
</form>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>