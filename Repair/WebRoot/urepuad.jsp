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
			var rep = document.myform.rep.value ;
			var repname = document.myform.repname.value ;
			var repphone = document.myform.repphone.value ;
			var repadd = document.myform.repadd.value ;
			var repid = document.myform.repid.value ;
			var reptime = document.myform.reptime.value ;
			var repstate = document.myform.repstate.value ;
			if(repphone=="" || repadd=="" )
			{
				alert("请将信息填写完整");
				
			}
			else
			{
				var flag=window.confirm("确定要修改吗?");
			
           			if(flag){ window.location.href="UpdateUserrepServlet?way=submit&rep="+rep+"&repname="+repname+"&repphone="+repphone+"&repadd="+repadd+"&repid="+repid+"&reptime="+reptime+"&repstate="+repstate;}
			}
		}
		function del(){
			var rep = document.myform.rep.value ;
			
			var flag=window.confirm("确定要删除吗?");
			
           		if(flag){ window.location.href="UpdateUserrepServlet?way=delete&rep="+rep;}
			
		}
	</script>


</head>

<body>
<center>


<form  method="post" name="myform" style="text-align:center" style="vertical-align:middle" style="font-size:24px" >
<br/><br/>
<table border="1" bgcolor="#FFFFCC" align="center">
    <tr height="20">
      <th colspan="4" class="aa" >修改维修工程师信息</th>
    </tr>
<tr><td>维修工编号：</td>
    <td><input type="text" name="rep" readonly="readonly" style="background:#FFFFCC"  value=${rep}  ></td></tr>
	
<tr><td>维修工姓名：</td><td><input type="text" name="repname" readonly="readonly"  style="background:#FFFFCC" 
                                   value=${repname}  ></td></tr>
	
<tr><td>维修工电话：</td><td><input type="text" name="repphone"    value=${repphone}  ></td></tr>
	
<tr><td>维修工地址：</td><td><input type="text" name="repadd"    value=${repadd}  ></td></tr>
<tr><td>维修工身份证号：</td><td><input type="text" name="repid" readonly="readonly" style="background:#FFFFCC" 
                                      value=${repid}  ></td></tr>
<tr><td>	
	维修工入职时间：</td><td><input type="text" name="reptime" readonly="readonly" style="background:#FFFFCC"                                  value=${reptime}  ></td></tr>
<tr><td>维修工工作状态：</td><td> <select name="repstate" style="width:80px" >
	          	               <option value="工作中">工作中</option>  
			                   <option value="可分配">可分配</option> 
			                   <option value="休息中">休息中</option>
		                 </select></td></tr>
</table>
<br/>
	<input type="button" value="修改" onClick="upd()">
	<input type="button" value="删除" onClick="del()">
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/>${text}
</form>
</center>
</body>
</html>
