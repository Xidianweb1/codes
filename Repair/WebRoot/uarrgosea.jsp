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
      <th colspan="4" class="aa" >故障信息</th>
    </tr>
 <c:forEach var="UgoodsSearch" items="${goods}">
<tr><td>故障编号：</td>
    <td><input type="text" name="agid" readonly style="background:#FFFFCC"  value=${UgoodsSearch.gid}  ></td></tr>
	
<tr><td>客户编号：</td><td><input type="text" name="gcltid"  readonly="readonly"  style="background:#FFFFCC" 
                                    value=${UgoodsSearch.gcltid}   ></td></tr>
	
<tr><td>客户姓名：</td><td><input type="text" name="gcltname"  readonly="readonly"  style="background:#FFFFCC" 
                                    value=${UgoodsSearch.gcltname}  ></td></tr>
<tr><td>客户电话：</td><td><input type="text" name="gcltphone" readonly style="background:#FFFFCC" 
                                      value=${UgoodsSearch.gcltphone}  ></td></tr>
<tr><td>	
	故障描述：</td><td><input type="text" name="gdescrip" readonly style="background:#FFFFCC"  value=${UgoodsSearch.gdescrip}  ></td></tr>
<tr><td>发生故障时间：</td><td><input type="text" name="gtime" readonly style="background:#FFFFCC"  value=${UgoodsSearch.gtime}  ></td></tr>
<tr><td>处理状态：</td><td><input type="text" name="gstate" readonly style="background:#FFFFCC" value=${UgoodsSearch.gstate}  ></td></tr>
<tr><td>申报时间：</td><td><input type="text" name="grtime" readonly style="background:#FFFFCC"   value=${UgoodsSearch.grtime}  ></td></tr>
<tr><td>故障原因：</td><td><input type="text" name="greason" readonly style="background:#FFFFCC"  value=${UgoodsSearch.greason}  ></td></tr>
<tr><td>维修人员编号：</td><td><input type="text" name="grep" readonly style="background:#FFFFCC"  value=${UgoodsSearch.grep}  ></td></tr>
<tr><td>解决时间：</td><td><input type="text" name="gdotime" readonly style="background:#FFFFCC"  value=${UgoodsSearch.gdotime}  ></td></tr>
</c:forEach>


</table>
<br/>
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/>
</form>
</center>
</body>
</html>
