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
<style type="text/css">

    a:hover{color:#000000;}
	a:link{color:#000000;}
	a:visited{color:#000000;}
</style>
</head>

<body>
<form  action="FindUserrepServlet" method="post" name="myform">
 <table align="center" id="">
    <tr>
        <td>
		    <p style="font-size:150%"><b>维修工程师查询</b></p>
		</td>		
	</tr>
</table>
<br />
<p align="center">

	查询方式：<select name="searchrep" style="width:80px">
	          	  <option value="0">全部</option>  
			      <option value="1">维修工程师编号</option> 
			      <option value="2">维修工程师姓名</option> 
			      <option value="3">入职时间</option>
                  <option value="4">工作状态</option>
		</select>&nbsp;
	输入内容：<input type="text" size="10" name="way"  />&nbsp;&nbsp;&nbsp;
	<input type="submit" value="查询"  /><span style="color:#000000">${text}</span>
</p>
<br/>
<table align="center" border="1"  width="900" bgcolor="#FFFFCC">
<tr align="center">
 <th colspan="11" height="30">维修工程师查询表单</th>
   <tr>
    <td align="center" width="100">管理员编号</td>	
    <td align="center" width="100">维修工程师姓名</td>
	<td align="center" width="100">联系电话</td>
	<td align="center" width="100">联系住址</td>
	<td align="center" width="100">身份证号</td>
    <td align="center" width="100">入职时间</td>
    <td align="center" width="100">工作状态</td>
    <td align="center" width="100">详情</td>
   </tr>
<c:forEach var="UrepSearch" items="${userrep}">
  	<tr>
  		<td>${UrepSearch.rep}</td>
		<td>${UrepSearch.repname}</td>
  		<td>${UrepSearch.repphone}</td>
		<td>${UrepSearch.repadd}</td>
		<td>${UrepSearch.repid}</td>
  		<td>${UrepSearch.reptime}</td>
		<td>${UrepSearch.repstate}</td>
		<td><a href="UpdateUserrepServlet?rep=${UrepSearch.rep}&repname=${UrepSearch.repname}&repphone=${UrepSearch.repphone}
		             &repadd=${UrepSearch.repadd}&repid=${UrepSearch.repid}&reptime=${UrepSearch.reptime}&repstate=${UrepSearch.repstate}" target="zhong">详情>></a></td>
  	</tr>
  </c:forEach>
  

</table>
</form>
<br />

<p align="center" width="600">
     <input type="button" size="20" value="上一页" />
	 <input type="button" size="10" value="&gt;&gt;"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 <input type="button" size="10" value="&gt;&gt;"  />
	 <input type="button" size="20" value="下一页" />&nbsp;&nbsp;
     <input type="text" size="1" name="page"  />
	 <input type="button" size="10" value="跳转"  />
</p>
</form>
</body>
</html>
