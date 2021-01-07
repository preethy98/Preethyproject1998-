<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
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
<h1 class="policydet">Policy Form</h3>
	<f:form action="createpolicy" method="post" modelAttribute="policy">
		<table class="table">
			<tr>
				<td>Policyname</td>
				<td><f:input path="policyname" /><f:errors path="policyname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Policytype</td>
				<td><f:input path="policytype" /><f:errors path="policytype" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Policyduration</td>
				<td><f:input path="policyduration" /><f:errors path="policyduration" cssClass="error" /></td>
			</tr>
			<td>PolicyAmount</td>
			<td><f:input path="policyamount" /><f:errors path="policyamount" cssClass="error" /></td>
			</tr>
			<tr>
				<td>CompanyName</td>
				<td><f:input path="companyname" /><f:errors path="companyname" cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="create" id="submitpolicy"></td>
					<td><input type="button" onclick="location.href='http://localhost:9090/Policymanagementsystem/';" value="Cancel" id="cancelpolicy"></td>
			</tr>
		</table>
	</f:form>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>