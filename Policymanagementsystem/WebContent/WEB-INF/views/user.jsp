<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h1 id="head" >Welcome User
	<c:out value="${userid}" /></h1>
	<hr>
	<table>
	<h2>Search By Category</h2>
		<form action="searchbyid" method="post">
			<tr>
				<td>Search By Id:</td>
				<td><input type="number" name="pid" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="search" class="search"></td>
			</tr>
		</form>
		<form action="searchbyname" method="post">
			<tr>
				<td>Search By Name:</td>
				<td><input type="text" name="pname" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="search" class="search"></td>
		</form>
		<form action="searchbytype" method="post">
			<tr>
				<td>Search By Type:</td>
				<td><input type="text" name="ptype" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="search" class="search"></td>
			</tr>
		</form>
		<form action="searchbycname" method="post">
			<tr>
				<td>Search By CompanyName:</td>
				<td><input type="text" name="cname" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="search" class="search"></td>
			</tr>
		</form>
		<form action="searchbytime" method="post">
			<tr>
				<td>Search By Duration:</td>
				<td><input type="number" name="ptime" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="search" class="search"></td>
			</tr>
		</form>
		<form action="searchbyamount" method="post">
			<tr>
				<td>Search By Amount:</td>
				<td><input type="number" name="pamount" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="search" class="search"></td>
			</tr>
		</form>
		<form action="specificsearch" method="post">
			<tr>
				<td>Search By Name:</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td>Search By Type:</td>
				<td><input type="text" name="ptype"></td>
			</tr>
			<tr>
				<td>Search By CompanyName:</td>
				<td><input type="text" name="cname"></td>
			</tr>
			<tr>
				<td>Search By Duration:</td>
				<td><input type="number" name="ptime"></td>
			</tr>
			<tr>
				<td>Search By Amount:</td>
				<td><input type="number" name="pamount"></td>
			</tr>
			<tr>
				<td><input type="submit" value="search" class="search"></td>
			</tr>
			<tr>
			<td><input type="button" onclick="location.href='http://localhost:9090/Policymanagementsystem/';" value="Logout" id="#cancel"></td>
			</tr>
		</form>
	</table>
	<c:out value="${cancelmsg}"/>
</body>
</div>
<footer class="footer"><i>All rights reserved to mbs policy management</i></footer>
</div>
</html>