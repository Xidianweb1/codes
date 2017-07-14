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
      <th colspan="4" class="aa" >维修工程师信息</th>
    </tr>
 <c:forEach var="UrepSearch" items="${userrep}">
<tr><td>维修工编号：</td>
    <td><input type="text" name="arep" readonly style="background:#FFFFCC"  value=${UrepSearch.rep}  ></td></tr>
	
<tr><td>维修工姓名：</td><td><input type="text" name="repname"  readonly="readonly"  style="background:#FFFFCC" 
                                    value=${UrepSearch.repname}   ></td></tr>
	
<tr><td>维修工电话：</td><td><input type="text" name="repphone"  readonly="readonly"  style="background:#FFFFCC" 
                                    value=${UrepSearch.repphone}  ></td></tr>
<tr><td>维修工地址：</td><td><input type="text" name="repadd" readonly style="background:#FFFFCC" 
                                      value=${UrepSearch.repadd}  ></td></tr>
<tr><td>	
	维修工身份证号：</td><td><input type="text" name="repid" readonly style="background:#FFFFCC"                                  value=${UrepSearch.repid}  ></td></tr>
    <tr><td>	
	维修工入职时间：</td><td><input type="text" name="reptime" readonly style="background:#FFFFCC"                                  value=${UrepSearch.reptime}  ></td></tr>
    <tr><td>	
	维修工工作状态：</td><td><input type="text" name="repstate" readonly style="background:#FFFFCC"                                  value=${UrepSearch.repstate}  ></td></tr>
</c:forEach>


</table>
<br/>
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/>
</form>
</center>
</body>
</html>
