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
			var aid = document.myform.aid.value ;
			var agid = document.myform.agid.value ;
			var acltid = document.myform.acltid.value ;
			var arep = document.myform.arep.value ;	
			var aresp = document.myform.aresp.value ;
			var atime = document.myform.atime.value ;
			if(atime=="" || arep=="" )
			{
				alert("请将信息填写完整");
				
			}
			else
			{
				var flag=window.confirm("确定要添加吗?");
			
           			if(flag){ window.location.href="NewArrangeServlet?aid="+aid+"&agid="+agid+"&acltid="+acltid+"&arep="+arep+"&aresp="+aresp+"&atime="+atime;}
			}
		}
		
		function queding()
        {
			var r = document.getElementsByName("rr");
	        for(var i=0;i<r.length;i++)
	        {
				if(r[i].checked)
		        arep.value = r[i].value;
		    }
	    }
	</script>


</head>

<body>
<center>
<table align="center" border="1"  width="220" bgcolor="#FFFFCC">
<tr align="center"><th colspan="2" height="30">可分配的维修人员</th></tr>
<c:forEach var="UrepSearch" items="${userrep}">
  <tr>
    <td align="center" width="200">维修人员编号</td>
    <td align="center" width="200">维修人员姓名</td>
  </tr>
<tr><td><input type="radio" name="rr" value=${UrepSearch.rep} >${UrepSearch.rep}</td>
    <td>${UrepSearch.repname}</td>
</tr>
</c:forEach>
</table><br/>
<input type="button" value="添加" onClick="queding()">
<br/><br/>

<form  method="post" name="myform" style="text-align:center" style="vertical-align:middle" style="font-size:24px" >
<br/><br/>
<table border="1" bgcolor="#FFFFCC" align="center">
    <tr height="20">
      <th colspan="4" class="aa" >维修工程师调度</th>
    </tr>
<tr><td>调度编号：</td><td><input type="text" name="aid" ></td></tr>
	
<tr><td>故障编号：</td><td><input type="text" name="agid" readonly  style="background:#FFFFCC"  value=${agid}  ></td></tr>
	
<tr><td>客户编号：</td><td><input type="text" name="acltid"  readonly style="background:#FFFFCC" value=${acltid}  ></td></tr>
	
<tr><td>维修人员：</td><td><input type="text" name="arep"   style="background:#FFFFCC"   ></td></tr>

<tr><td>负责人：</td><td><input type="text" name="aresp" readonly style="background:#FFFFCC"  value=${aresp}  ></td></tr>

<tr><td>分配时间：</td><td><input type="text" name="atime"    value=${atime}  ></td></tr>
</table>
<br/>
	<input type="button" value="确定" onClick="upd()">
	<input type="button" name="cancel" value="返回"  onclick="javascript:history.back();"/> ${text}
</form>
</center>
</body>
</html>
