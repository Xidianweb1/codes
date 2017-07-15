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
<form  method="post" name="myform" >
<br/>
<table border="1" bgcolor="#FFFFCC" align="center">
    <th height="20" colspan="6">
     个人信息
    </th>
    <c:forEach var="UcltSearch" items="${userclt}">
  <tr height="20">
    <td class="aa">客户编号</td>
    <td><input type="text" name="cltid" readonly style="background:#FFFFCC"  value=${UcltSearch.cltid}  /></td>
   </tr>
   <tr height="20">
    <td class="aa">密   码：</td>
    <td><input type="text" name="cltpass" readonly style="background:#FFFFCC"  value=${UcltSearch.cltpass}  /></td>
   </tr>
   <tr>
	 <td class="aa">客户姓名</td>
    <td><input name="cltname" type="text"  readonly="readonly" style="background:#FFFFCC"  value=${UcltSearch.cltname} /></td>  
  </tr>
  <tr height="20">
    <td class="aa"> 联系电话</td>
    <td><input name="cltphone" type="text" readonly="readonly" style="background:#FFFFCC"  value=${UcltSearch.cltphone} /></td>
 </tr>
 <tr>
   	<td class="aa">联系地址</td> 
    <td><input name="cltadd" type="text" readonly="readonly" style="background:#FFFFCC" value=${UcltSearch.cltadd} /></td>
    </tr>
    <tr>
	 	<td class="aa">购买产品时间时间</td>
    <td><input name="cltbuytime" type="text" readonly style="background:#FFFFCC"  value=${UcltSearch.cltbuytime} /></td>
    </tr>
  </c:forEach>
</table>
</form>
</center>
</body>
</html>
