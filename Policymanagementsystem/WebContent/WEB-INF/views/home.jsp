<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>.container{width:100%;margin:2rem 1rem;}
.title{ color:orange;
background-color:white;
text-align:center;}
 p{ margin:10px;padding:10px; box-shadow:0 2px 8px blue;}
 #signup,#adminsignup{display:inline-block;text-decoration:none;}
 body{background-color:lightgrey;}
 .img{margin:10px auto 20px; display:block;width:30%;}
 </style>
</head>
<body>
 <%@ include file="navbar.jsp" %>
 <nav class="navbar">
<ul class="nav-items">
<div class="heading">
<li class="nav-item"><a href="view"><h3>Info</h3></a></li>
<li class="nav-item"><a href="mainpage"><h3>Home</h3></a></li>
<li class="nav-item"><a id="login" href="userlog" ><h3>User</h3></a></li>
<li class="nav-item"><a id="adminlogin" href="adminlog" ><h3>Admin</h3></a></li>
</div>
</ul>
<br>
<br>
<br>
</nav>
 	<div class="container"></div>
	<h1 class="title"><i>WELCOME POLICY BEARERS</i></h1>
	<br>
	<br>
	<ul>
	<li><a id="signup" href="userreg" ><h3>New User Registration</h3></a></li><br><br><br>
	<li><a id="adminsignup" href="adminreg" ><h3>New Admin Registration</h3></a></li>
</ul>
	<img class="img" src="F:\my eclipse workspace\Policymanagementsystem\WebContent\WEB-INF\image\Policy-icon.png"/>
	<br>
 <div class="container">
<section class="loginmodal">
<form action="login" method="post">
<div class="form-group">
UserId<input type="text" name="userid" id="userid">
</div><div>
Password<input type="password" name="password" id="password">
</div>
<div>
<input type="submit" value="Login" id="loginaccess"><input type="button" value="Cancel" id="cancel">
</div>
</form>
</section>

<section class="signupmodal">
<form action="signup" method="post">
<div class="form-group">
Firstname<input type="text" name="fname" id="fname">
</div>
<div class="form-group">
Lastname<input type="text" name="lname" id="lname">
</div>
<div class="form-group">
Age<input type="number" name="age" id="age">
</div>
<div class="form-group">
Gender<input type="radio"  id="male" value="male" name="gender">Male
<input type="radio" id="female" value="female" name="gender">Female</div>
<div class="form-group">
Contactnumber<input type="number" name="cno" id="cno">
</div><div class="form-group">
UserId<input type="text" name="uid" id="uid">
</div><div class="form-group">
Password<input type="password" name="password" id="password">
</div>
<div>
<input type="submit" value="signup" id="signupaccess"><input type="button" value="Cancel" id="cancelsignup">
</div>
</form>
</section>

<section class="adminloginmodal">
<form action="adminlogin" method="post">
<div class="form-group">
AdminId<input type="text" name="aid" id="aid">
</div><div>
Password<input type="password" name="password" id="password">
</div>
<div>
<input type="submit" value="Login" id="adminloginaccess"><input type="button" value="Cancel" id="admincancel">
</div>
</form>
</section>
</div>
<footer class="footerfpage"><i>All rights reserved to mbs policy management</i></footer>
</div>
</body>
</html>