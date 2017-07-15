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
<meta charset="UTF-8">
<title>管理员个人信息修改</title>
	<script language="javascript">
		function upd(){
			var rem = document.myform.rem.value ;
			var remname = document.myform.remname.value ;
			var remphone = document.myform.remphone.value ;
			var remadd = document.myform.remadd.value ;
			var remid = document.myform.remid.value ;
			var remtime = document.myform.remtime.value ;
			var rempass = document.myform.rempass.value;
			var rempasswo = document.myform.rempasswo.value;
			if(rem=="" || remname=="" ||rempass==""||rempasswo==""|| remphone=="" || remadd=="" || remid=="" || remtime=="")
			{
				alert("请将信息填写完整");
			}else if(rempass != rempasswo){
				alert("两次密码不一致");
			}
			
			else{
				var flag=window.confirm("确定要修改吗");
			
           			if(flag){ 
				window.location.href="UpdateUsertypeServlet?rem="+rem+"&rempass="+rempass+"&remname="+remname+
				"&remphone="+remphone+"&remadd="+remadd+"&remid="+remid+"&remtime="+remtime;
				}
			}
			
		}
		
	</script>
</head>

<body>
<center>
<form  method="post" name="myform">
<br/>
<table border="1" bgcolor="#FFFFCC" align="center">
    <th height="20" colspan="6">
     修改管理员个人信息
    </th>
    <c:forEach var="UremSearch" items="${usertype}">
  <tr height="20">
    <td class="aa">管理员编号</td>
    <td><input type="text" name="rem" readonly="readonly" style="background:#FFFFCC"  value=${UremSearch.rem}  /></td>
   
	 <td class="aa">管理员姓名</td>
    <td><input name="remname" type="text"  readonly="readonly" style="background:#FFFFCC"  value=${UremSearch.remname} /></td>  
  </tr>
  <tr height="20">
    <td class="aa">密码</td>
    <td><input type="password" name="rempass"  value=${UremSearch.rempass} /></td>
   
	 <td class="aa">确认密码</td>
    <td><input name="rempasswo" type="password" value=${UremSearch.rempass} /></td>  
  </tr>
  <tr height="20">
    <td class="aa"> 联系电话</td>
    <td><input name="remphone" type="text"  value=${UremSearch.remphone} /></td>
    <td class="aa">身份证号</td>
    <td><input name="remid" type="text"   readonly="readonly" style="background:#FFFFCC"  value=${UremSearch.remid} /></td>
 </tr>
   	<td class="aa">联系地址</td>
    <td><input name="remadd" type="text"  value=${UremSearch.remadd} /></td>
	 	<td class="aa">入职时间</td>
    <td><input name="remtime" type="text" readonly="readonly" style="background:#FFFFCC"  value=${UremSearch.remtime} /></td>
  </c:forEach>
</table>
<p align="center">${text}</p>
<p align="center" >
<input type="button" name="add" value="提交" onclick="upd()" />&nbsp;&nbsp;&nbsp;
<input type="button" name="cancel" value="返回" onclick="javascript:history.back();" />
</p>
</form>
</center>
</body>
</html>
