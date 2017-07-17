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


<form  method="post" action="NewUserrepServlet" style="text-align:center" style="vertical-align:middle" style="font-size:24px" >
<br/><br/><!--换行符一下是用表格布局展示维修人员的信息>
<table border="1" bgcolor="#FFFFCC" align="center">
    <tr height="20">
      <th colspan="4" class="aa" >新增维修工程师信息</th>
    </tr>
<tr><td>维修工编号：</td><td><input type="text" name="urep" /></td></tr>
<tr><td>维修工密码：</td><td><input type="password" name="ureppass" /></td></tr>
<tr><td>维修工姓名：</td><td><input type="text" name="urepname"  /></td></tr>
<tr><td>维修工电话：</td><td><input type="text" name="urepphone" /></td></tr>
<tr><td>维修工地址：</td><td><input type="text" name="urepadd" /></td></tr>
<tr><td>维修工身份证号：</td><td><input type="text" name="urepid"  /></td></tr>
<tr><td>维修工入职时间：</td><td><input type="text" name="ureptime" /></td></tr>
<tr><td>维修工工作状态：</td><td> <select name="urepstate" style="width:150px" >
	          	               <option value="工作中">工作中</option>  
			                   <option value="可分配">可分配</option> 
			                   <option value="休息中">休息中</option>
		                 </select></td></tr>
</table>
<br/>
	<input type="submit" value="提交" />
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/>&nbsp; ${aa}
</form>
</center>
</body>
</html>
