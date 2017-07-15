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
<form  action="FindUsercltServlet" method="post" name="myform">
 <table align="center" id="">
    <tr>
        <td>
		    <p style="font-size:150%"><b>客户查询</b></p>
			</td>		
	</tr>
</table>
<br />
<p align="center">

	查询方式：<select name="searchclt" style="width:80px">
	          	  <option value="0">全部</option>  
			  <option value="1">客户编号</option> 
			  <option value="2">客户姓名</option> 
			  <option value="3">购买产品时间</option>
		</select>&nbsp;
	输入内容：<input type="text" size="10" name="way"  />&nbsp;&nbsp;&nbsp;
	<input type="submit" value="查询"  /><span style="color:#000000">${text}</span>
</p>
<br/>
<table align="center" border="1"  width="900" bgcolor="#FFFFCC">
<tr align="center">
<th colspan="11" height="30">客户查询表单
</th>
   <tr>
    <td align="center" width="100">客户编号</td>	
    <td align="center" width="100">客户姓名</td>
	<td align="center" width="100">客户电话</td>
	<td align="center" width="100">客户地址</td>
	<td align="center" width="100">购买产品时间</td>
    <td align="center" width="100">详情</td>
   </tr>
<c:forEach var="UcltSearch" items="${userclt}">
  	<tr>
  		<td>${UcltSearch.cltid}</td>
		<td>${UcltSearch.cltname}</td>
  		<td>${UcltSearch.cltphone}</td>
		<td>${UcltSearch.cltadd}</td>
		<td>${UcltSearch.cltbuytime}</td>
        <td><a href="UpdateUsercltServlet?cltid=${UcltSearch.cltid}&cltname=${UcltSearch.cltname}&cltphone=${UcltSearch.cltphone}
		             &cltadd=${UcltSearch.cltadd}&cltbuytime=${UcltSearch.cltbuytime}&cltpass=${UcltSearch.cltpass}" target="zhong">详情>></a></td>
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
