<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.mldn.cn/jst/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html >
<head>
<meta charset="utf-8">
<title>XD客服维修调度管理系统</title>
 <LINK href="css/style.css" rel="stylesheet" type="text/css">
  <LINK href="css/tmp.css" rel="stylesheet" type="text/css">

<style type="text/css">

    a:hover{
	color:#000000;}
	
	a:link{
	color:#000000;}
	
	a:visited{
	color:#000000;}
	
</style>
</head>
     
<body background="bac9.jpg">
<form name="kb"   method="post">
<table width="100%"  cellspacing="0" height="100%">
<tr>
<td><h1 style="font-size:200%;color:#000000">
      XD公司客服维修人员调度管理系统	
	</h1>
</td>
<td>
    <h1 align="right" style="font-size:16px;color:#000000">欢迎用户,${username}。&nbsp;
    <a href="login.jsp" target="_parent" onmouseover="style.color='#CCCCCC'" onmouseout="style.color='#000000'">|&nbsp;注销&nbsp;|</a></h1>
</td>
</tr>
</table>
</form>
</body>
</html>
