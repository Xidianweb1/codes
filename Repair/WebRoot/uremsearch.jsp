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
<meta charset="UTF-8">
<title>无标题文档</title>
<style type="text/css">

    a:hover{color:#000000;}
	a:link{color:#000000;}
	a:visited{color:#000000;}
</style>
</head>

<body>
<form  action="FindUsertypeServlet" method="post" name="myform">
 <table align="center" id="">
    <tr>
        <td>
		    <span style="font-size:150%"><b>管理员查询</b></span>
			</td>		
	</tr>
</table>
<p align="center">

	查询方式<select name="searchrem" style="width:80px">
	          	  <option value="0">全部</option>
	          	  <option value="1">管理员编号</option>  
			  <option value="2">员工姓名</option> 
			  <option value="3">入职时间</option> 
			  
		</select>&nbsp;
	输入内容<input type="text" size="10" name="way"  />&nbsp;&nbsp;&nbsp;
	<input type="submit" value="查询"  /><span style="color:#000000">&nbsp;&nbsp;${text}</span>
</p>
<table align="center" border="1"  width="900" bgcolor="#FFFFCC">
<tr align="center">
<th colspan="11" height="30">管理员查询表单
</th>
   <tr>
    <td align="center" width="100">管理员编号</td>	
    <td align="center" width="100">员工姓名</td>
	<td align="center" width="100">联系电话</td>
	<td align="center" width="100">联系住址</td>
	<td align="center" width="100">身份证号</td>
    <td align="center" width="100">入职时间</td>
   </tr>
<c:forEach var="UremSearch" items="${usertype}">
  	<tr>
  		<td>${UremSearch.rem}</td>
		<td>${UremSearch.remname}</td>
  		<td>${UremSearch.remphone}</td>
		<td>${UremSearch.remadd}</td>
		<td>${UremSearch.remid}</td>
  		<td>${UremSearch.remtime}</td>
		
  		
  	</tr>
  </c:forEach>
  

</table>


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
