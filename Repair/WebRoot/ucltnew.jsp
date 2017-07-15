<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://www.mldn.cn/jst/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>无标题文档</title>
</head>

<body>
<center>


<form  method="post" action="NewUsercltServlet" style="text-align:center" style="vertical-align:middle" style="font-size:24px" >
<br/><br/>
<table border="1" bgcolor="#FFFFCC" align="center">
    <tr height="20">
      <th colspan="4" class="aa" >新增客户信息</th>
    </tr>
<tr><td>客户编号：</td><td><input type="text" name="ucltid" /></td></tr>
<tr><td>客户密码：</td><td><input type="password" name="ucltpass" /></td></tr>
<tr><td>确认密码：</td><td><input type="password" name="ucltpasswo" /></td></tr>
<tr><td>客户姓名：</td><td><input type="text" name="ucltname"  /></td></tr>
<tr><td>客户电话：</td><td><input type="text" name="ucltphone" /></td></tr>
<tr><td>客户地址：</td><td><input type="text" name="ucltadd" /></td></tr>
<tr><td>购买产品时间：</td><td><input type="text" name="ucltbuytime"  /></td></tr>

</table>
<br/>
	<input type="submit" value="提交" onClick="upd()">
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/>${text}
</form>
</center>
</body>
</html>
