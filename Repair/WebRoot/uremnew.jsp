<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://www.mldn.cn/jst/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <base href="<%=basePath%>">
 <meta charset="UTF-8">
<title>用户注册</title>
</head>
<body style="align-content:center">
<table align="center">
<tr>
    <td align="center">
	  <h2 style="font-size:150%;font-family:"Courier New", Courier, monospace">
	管理员注册</h2><br/><br/>
</table>
    <table align="center"><tr><td><li></li>
        <form action="NewUsertypeServlet" method="post">
            员工编号<input type="text" name="urem"><br/>
			<p/>
		  姓&nbsp;&nbsp;&nbsp;&nbsp;名<input type="text" name="uremname" onkeyup="value=value.replace(/[ , ]/g,'')"/><br/>
			<p/>
			密&nbsp;&nbsp;&nbsp;&nbsp;码<input type="password" name="upassword" maxlength="16"  />
		  <br/>
			<p/>
			确认密码<input type="password" name="upass" maxlength="16" />
			<br/>
			<p/>
			联系电话<input name="uremphone" type="text" onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="11"/>
			<br/>
			<p/>
			联系地址<input type="text" name="uremadd"/><br/>
			<p/>
           身份证号<input name="uremid" type="text" onkeyup="value=value.replace(/[^\d]/g,'')" maxlength="11"/>
			<br/>
			<p/>
			入职时间<input type="text" name="uremtime"/><br/>
			<p/>
			<input type="reset" value="重填"/>&nbsp;&nbsp;&nbsp;
            <input type="submit" value="同意以下服务条款，提交注册信息"/>&nbsp; ${aa}
		       
		</form>
		<textarea name="userve" rows="10" cols="40" readonly="readonly">本服务条款为本系统和用户使用，用户无条件遵守该协议。本协议解释权归本系统所有。</textarea>
	</td></tr></table>	
</body>
</html>
