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
		function add(){
		    var gid = document.myform.gid.value ;
			var cltid = document.myform.cltid.value ;
			var cltname = document.myform.cltname.value ;
			var cltphone = document.myform.cltphone.value ;
			var gdescrip = document.myform.gdescrip.value ;
			var gtime = document.myform.gtime.value ;			
			var gstate = document.myform.gstate.value ;
			var grtime = document.myform.grtime.value ;
			if(gdescrip=="" || gtime=="" ||grtime=="")
			{
				alert("请将信息填写完整");
				
			}
			else 
			{
				var flag=window.confirm("确定要添加吗? ");
			
           			if(flag){ 
           			window.location.href="NewMyGoodsServlet?gid="+gid+"&cltid="+cltid+"&cltname="+cltname+
           			                      "&cltphone="+cltphone+"&gdescrip="+gdescrip+"&gtime="+gtime+"&gstate="+gstate+"&grtime="+grtime;}
			} 
			
		}
	</script>
</head>

<body>
<center>


<form  method="post"  name="myform" style="text-align:center" style="vertical-align:middle" style="font-size:24px" >
<br/><br/>
<table border="1" bgcolor="#FFFFCC" align="center">
      <th colspan="4" class="aa" >新增故障物品报修信息</th>
    <c:forEach var="UgoodsSearch" items="${userclt}">
<tr><td>故障编号：</td><td><input type="text" name="gid" /></td></tr>
<tr><td>客户编号：</td><td><input type="text" name="cltid" readonly value=${UgoodsSearch.cltid} /></td></tr>
<tr><td>客户姓名：</td><td><input type="text" name="cltname"  readonly value=${UgoodsSearch.cltname} /></td></tr>
<tr><td>客户电话：</td><td><input type="text" name="cltphone"  readonly value=${UgoodsSearch.cltphone} /></td></tr>
<tr><td>故障描述：</td><td><input type="text" name="gdescrip" /></td></tr>
<tr><td>故障发生时间：</td><td><input type="text" name="gtime"  /></td></tr>
<tr><td>处理状态：</td><td><input type="text" name="gstate"   readonly value="待处理" /></td></tr>
<tr><td>申报时间：</td><td><input type="text" name="grtime" /></td></tr>
</c:forEach>
</table>
<br/>
	<input type="button" value="提交" onClick="add()">
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/> ${text}
</form>
</center>
</body>
</html>
