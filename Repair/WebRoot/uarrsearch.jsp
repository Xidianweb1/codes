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
<form action="FindArrangeServlet" method="post" name="myform">
 <table align="center" id="">
    <tr>
        <td>
		    <p style="font-size:150%"><b>调度信息查询</b></p>
			</td>		
	</tr>
</table>
<br />
<p align="center">

	查询方式：<select name="searcharr" style="width:80px">
	          	  <option value="0">全部</option>  
			  <option value="1">调度编号</option> 
			  <option value="2">故障编号</option> 
              <option value="3">客户编号</option>
              <option value="4">负责人</option>
              <option value="5">分配时间</option>
              <option value="6">维修人员</option>
		</select>&nbsp;
	输入内容：<input type="text" size="10" name="way"  />&nbsp;&nbsp;&nbsp;
	<input type="submit" value="查询"  /><span style="color:#000000">${text}</span>
</p>
<br/>
<table align="center" border="1"  width="900" bgcolor="#FFFFCC">
<tr align="center">
<th colspan="11" height="30">调度信息查询表单
</th>
   <tr>
    <td align="center" width="50">调度编号</td>
    <td align="center" width="50">故障编号</td>	
    <td align="center" width="50">客户编号</td>
    <td align="center" width="50">维修人员编号</td>
    <td align="center" width="50">负责人</td>	
	<td align="center" width="100">分配时间</td>
   </tr>
<c:forEach var="UarrSearch" items="${arrange}">
  	<tr>
  		<td>${UarrSearch.aid}</td>
        <td><a href="FindArrGooServlet?agid=${UarrSearch.agid}" target="zhong">${UarrSearch.agid}</a></td>
		<td><a href="FindArrCltServlet?acltid=${UarrSearch.acltid}" target="zhong">${UarrSearch.acltid}</a></td>
  		<td><a href="FindArrRepServlet?arep=${UarrSearch.arep}" target="zhong">${UarrSearch.arep}</a></td>
  		<td>${UarrSearch.aresp}</td>	
		<td>${UarrSearch.atime}</td>
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
