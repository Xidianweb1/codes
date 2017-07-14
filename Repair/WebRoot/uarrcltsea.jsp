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


<form  method="post" name="myform" style="text-align:center" style="vertical-align:middle" style="font-size:24px" >
<br/><br/>
<table border="1" bgcolor="#FFFFCC" align="center">
    <tr height="20">
      <th colspan="4" class="aa" >客户信息</th>
    </tr>
 <c:forEach var="UcltSearch" items="${userclt}">
<tr><td>客户编号：</td>
    <td><input type="text" name="acltid" readonly style="background:#FFFFCC"  value=${UcltSearch.cltid}  ></td></tr>
	
<tr><td>客户姓名：</td><td><input type="text" name="cltname"  readonly="readonly"  style="background:#FFFFCC" 
                                    value=${UcltSearch.cltname}   ></td></tr>
	
<tr><td>客户电话：</td><td><input type="text" name="cltphone"  readonly="readonly"  style="background:#FFFFCC" 
                                    value=${UcltSearch.cltphone}  ></td></tr>
<tr><td>客户地址：</td><td><input type="text" name="cltadd" readonly style="background:#FFFFCC" 
                                      value=${UcltSearch.cltadd}  ></td></tr>
<tr><td>	
	客户购买产品时间：</td><td><input type="text" name="cltbuytime" readonly style="background:#FFFFCC"                                  value=${UcltSearch.cltbuytime}  ></td></tr>
</c:forEach>


</table>
<br/>
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/>
</form>
</center>
</body>
</html>
