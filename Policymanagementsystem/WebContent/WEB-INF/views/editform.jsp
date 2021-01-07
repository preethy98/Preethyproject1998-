<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
<h3 style="color:purple;"></h3>
<f:form action="update" method="post" modelAttribute="policy">
<table class="table">
<f:hidden path="policyid"/>
<tr>
<td>Policy Name:</td>
<td><f:input path="policyname"/>
</td>
</tr>
<tr>
<td>Policy Type:</td>
<td><f:input path="policytype"/>
</td>
</tr>
<tr>
<td>Policy duration:</td>
<td><f:input path="policyduration"/>
</td>
</tr>
<tr>
<td>Policy Amount:</td>
<td><f:input path="policyamount"/>
</td>
</tr>
<tr>
<td>Company Name:</td>
<td><f:input path="companyname"/>
</td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="update"></td>
</tr>
</table>
</f:form>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>