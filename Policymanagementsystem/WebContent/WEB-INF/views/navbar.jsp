<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
*{
margin:0px;
box-sizing:border-box;}
.navbar{width:100%;
background-color:#ccccc;}
.nav-items{display:block;background-color:grey;padding-bottom:20px;padding-top:20px;}
.nav-item{display:inline-block;
width:150px;}
.formgroup{padding:10px;}
.nav-item a,.link{text-decoration:none;color:lightblue;font-weight:bold;font-family:serif;}
.loginmodal,.adminloginmodal{position:fixed;width:200px;top:30%;left:40%;display:none;box-shadow:0 4px 8px blue;}
.signupmodal,.adminsignupmodal{position:fixed;width:400px;top:30%;left:40%;display:none; box-shadow:0 2px 8px blue;}
.visible{display:block;}
#loginaccess,#signupaccess,#adminloginaccess,#adminsignupaccess,#userloginaccess{background-color:Silver;}
#cancel,#cancelsignup,#admincancelsignup,#admincancel,#usercancellogin{background-color:Silver;margin-right:50px;}
.errmsg{color:red;text-align:center;margin-top:50px;box-shadow:2px 2px 8px blue;}
body{background-color:lightgrey;}
.table{background-color:Teal;border:none;margin-left:auto;margin-right:auto;padding:50px 50px 50px 50px;}
#head{color:purple;}
.head{text-align:center;}
.search{background-color:purple;color:white;}
.gpay{color:blue;text-align:center;}
.policydet{color:purple;text-align:center;}
.policy{text-decoration:none; color:orange;}
.successmsg{color:green;text-align:center;}
.footer{
position:fixed;
left:10;
bottom:5px;
right:10;
width:100%;
background-color:grey;
color:white;
padding:3px;
text-align:center; }
.footerfpage{
position:relative;
left:10;
bottom:5px;
right:10;
width:100%;
background-color:grey;
color:white;
padding:3px;
text-align:center; }
</style>