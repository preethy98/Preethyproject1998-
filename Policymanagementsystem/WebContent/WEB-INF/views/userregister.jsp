<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error{color:red;
background-color:#ffEEEE;
border:2px solid #ff0000;
padding:1px;
margin:1px;}
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
<section>
<f:form action="usersignup" method="post" modelAttribute="user">
<h3 class="policydet">REGISTRATION FORM</h3>
<table  class="table"><tr><td>
Firstname</td><td><f:input path="firstname"/><f:errors path="firstname" cssClass="error"/></td></tr>
<tr><td>Lastname</td><td><f:input path="lastname"/><f:errors path="lastname" cssClass="error"/></td></tr>
<tr><td>Age</td><td><f:input path="age"/><f:errors path="age" cssClass="error"/></td></tr>
<tr><td>Gender</td>
<td>Male<f:radiobutton path="gender" value="Male"/>
Female<f:radiobutton path="gender" value="Female"/><f:errors path="gender" cssClass="error"/></td></tr>
<tr><td>Contactnumber</td><td><f:input path="contactnumber"/><f:errors path="contactnumber" cssClass="error"/></td></tr>
<tr><td>UserId</td><td><f:input path="userid"/><f:errors path="userid" cssClass="error"/></td></tr>
<tr><td>Password</td><td><f:password path="password"/><f:errors path="password" cssClass="error"/></td></tr>
<tr><td><input type="submit" value="signup" id="usersignupaccess"></td><td><input type="button" onclick="location.href='http://localhost:9090/Policymanagementsystem/';" value="Cancel" id="usercancelsignup">
</td></tr></table>
</f:form>
</section>
<c:out value="${msg}"/>
</body>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>