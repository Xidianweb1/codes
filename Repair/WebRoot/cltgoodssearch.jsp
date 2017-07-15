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
<!--  <script language="javascript">
		function sea(){
		        var cltid = document.myform.cltid.value ;
		        alert("啦啦啦");	
		 //       var t = document.getElementById("searchgoods").value ; 
				window.location.href="FindGoodsServlet?cltid="+cltid;		
		}
		
	</script>  -->
</head>

<body>
<form  method="post"  name="myform" action="FindGoodsServlet">
 <table align="center" id="">
    <tr>
        <td>
		    <p style="font-size:150%"><b>报修故障物品信息查询</b></p>
			</td>		
	</tr>
</table>
<br />
<p align="center">

	查询方式：<select name="searchgoods" style="width:80px">
	          	  <option value="0">全部</option>
	          	  <option value="1">待处理</option>  
			  <option value="2">处理中</option> 
			  <option value="3">已处理</option>			  
		</select>&nbsp;&nbsp;&nbsp;&nbsp;
		<c:forEach var="UcltSearch" items="${userclt}">
		<input type="text" readonly="readonly" name="cltid" width="50px" value=${UcltSearch.cltid} /></c:forEach>
	<input type="submit" value="查询"  /><span style="color:#000000">${text}</span>
</p>
<br/>
<table align="center" border="1"  width="900" bgcolor="#FFFFCC">
<tr align="center">
<th colspan="11" height="30">故障物品查询表单
</th>
   <tr>
    <td align="center" width="50">故障编号</td>	
    <td align="center" width="50">客户编号</td>
    <td align="center" width="50">客户姓名</td>
	<td align="center" width="50">联系电话</td>
	<td align="center" width="100">故障描述</td>
	<td align="center" width="50">故障发生时间</td>
    <td align="center" width="50">处理状态</td>
    <td align="center" width="50">申报时间</td>
    <td align="center" width="100">故障原因</td>
    <td align="center" width="50">维修工姓名</td>
    <td align="center" width="50">解决时间</td>
   </tr>
<c:forEach var="UgoodsSearch" items="${goods}">
  	<tr>
  		<td>${UgoodsSearch.gid}</td>
        <td>${UgoodsSearch.gcltid}</td>
		<td>${UgoodsSearch.gcltname}</td>
  		<td>${UgoodsSearch.gcltphone}</td>
		<td>${UgoodsSearch.gdescrip}</td>
		<td>${UgoodsSearch.gtime}</td>
  		<td>${UgoodsSearch.gstate}</td>
		<td>${UgoodsSearch.grtime}</td>
        <td>${UgoodsSearch.greason}</td>
  		<td>${UgoodsSearch.grep}</td>
		<td>${UgoodsSearch.gdotime}</td>
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
