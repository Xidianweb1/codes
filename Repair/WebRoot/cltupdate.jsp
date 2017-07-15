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
<script language="javascript">
		function upd(){
			var cltid = document.myform.cltid.value ;
			var cltname = document.myform.cltname.value ;
			var cltpass = document.myform.cltpass.value ;
			var cltpasswo = document.myform.cltpasswo.value ;
			var cltphone = document.myform.cltphone.value ;
			var cltadd = document.myform.cltadd.value ;
			var cltbuytime = document.myform.cltbuytime.value ;
			if(cltphone=="" || cltadd=="" || cltpass=="" ||cltpasswo=="")
			{
				alert("请将信息填写完整");
				
			}else if(cltpass != cltpasswo)
			{    alert("两次密码不一致");
			}
			else 
			{
				var flag=window.confirm("确定要修改吗?");
			
           			if(flag){ 
           			window.location.href="UpdateMyUsercltServlet?cltid="+cltid+"&cltname="+cltname+
           			                      "&cltphone="+cltphone+"&cltbuytime="+cltbuytime+"&cltadd="+cltadd+"&cltpass="+cltpass;}
			} 
			
		}
	</script>


</head>

<body>
<center>


<form  method="post" name="myform" style="text-align:center" style="vertical-align:middle" style="font-size:24px" >
<br/><br/>
<table border="1" bgcolor="#FFFFCC" align="center">
    <th height="20" colspan="6"> 修改个人信息</th>
    
    <c:forEach var="UcltSearch" items="${userclt}">
<tr><td>客户编号：</td>
    <td><input type="text" name="cltid" readonly style="background:#FFFFCC"  value=${UcltSearch.cltid} /></td></tr>
	
<tr><td>客户姓名：</td><td><input type="text" name="cltname" readonly  style="background:#FFFFCC" 
                                   value=${UcltSearch.cltname} / ></td></tr>
<tr><td>密   码：</td><td><input type="password" name="cltpass" value=${UcltSearch.cltpass} /></td></tr>
<tr><td>确认密码：</td><td><input type="password" name="cltpasswo"  value=${UcltSearch.cltpass} /></td></tr>
	
<tr><td>客户电话：</td><td><input type="text" name="cltphone"    value=${UcltSearch.cltphone} /></td></tr>
	
<tr><td>客户地址：</td><td><input type="text" name="cltadd"    value=${UcltSearch.cltadd} /></td></tr>
<tr><td>客户购买产品时间：</td><td><input type="text" name="cltbuytime" readonly style="background:#FFFFCC" 
                                      value=${UcltSearch.cltbuytime} /></td></tr>
</c:forEach>
</table>
<p align="center" >
<input type="button" name="add" value="修改" onclick="upd()" />&nbsp;&nbsp;&nbsp;
<input type="button" name="cancel" value="返回" onclick="javascript:history.back();" />${text}
</p> 
</form>
</center>
</body>
</html>

