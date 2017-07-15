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
			var cltpass = document.myform.cltpass.value ;
			var cltname = document.myform.cltname.value ;
			var cltphone = document.myform.cltphone.value ;
			var cltadd = document.myform.cltadd.value ;
			var cltbuytime = document.myform.cltbuytime.value ;
			if(cltphone=="" || cltadd=="" )
			{
				alert("请将信息填写完整");
				
			}
			else
			{
				var flag=window.confirm("确定要修改吗?");
			
           			if(flag){ window.location.href="UpdateUsercltServlet?way=submit&cltid="+cltid+"&cltname="+cltname+"&cltphone="+cltphone+"&cltbuytime="+cltbuytime+"&cltadd="+cltadd+"&cltpass="+cltpass;}
			}
		}
		function del(){
			var cltid = document.myform.cltid.value ;
			
			var flag=window.confirm("确定要删除吗?");
			
           		if(flag){ window.location.href="UpdateUsercltServlet?way=delete&cltid="+cltid;}
			
		}
	</script>


</head>

<body>
<center>


<form  method="post" name="myform" style="text-align:center" style="vertical-align:middle" style="font-size:24px" >
<br/><br/>
<table border="1" bgcolor="#FFFFCC" align="center">
    <tr height="20">
      <th colspan="4" class="aa" >修改客户信息</th>
    </tr>
<tr><td>客户编号：</td>
    <td><input type="text" name="cltid" readonly style="background:#FFFFCC"  value=${cltid}  ></td></tr>
<tr><td>客户密码：</td>
    <td><input type="password" name="cltpass" readonly style="background:#FFFFCC"  value=${cltpass}  ></td></tr>
	
<tr><td>客户姓名：</td><td><input type="text" name="cltname" readonly  style="background:#FFFFCC" 
                                   value=${cltname}  ></td></tr>
	
<tr><td>客户电话：</td><td><input type="text" name="cltphone"    value=${cltphone}  ></td></tr>
	
<tr><td>客户地址：</td><td><input type="text" name="cltadd"    value=${cltadd}  ></td></tr>
<tr><td>客户购买产品时间：</td><td><input type="text" name="cltbuytime" readonly style="background:#FFFFCC" 
                                      value=${cltbuytime}  ></td></tr>
</table>
<br/>
	<input type="button" value="修改" onClick="upd()">
	<input type="button" value="删除" onClick="del()">
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/> ${text}
</form>
</center>
</body>
</html>
