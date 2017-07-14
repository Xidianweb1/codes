<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.mldn.cn/jst/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <base href="<%=basePath%>">
 <meta charset="UTF-8">
 <title>欢迎使用XX公司客服维修人员调度系统！请登录</title>
 <LINK href="css/style.css" rel="stylesheet" type="text/css">
  <LINK href="css/tmp.css" rel="stylesheet" type="text/css">
</head>
<style type="text/css">
   a:hover{ text-decoration:none; color:#000000;}	
  a:link { text-decoration:none; color:#000000;}	
  a:visited { text-decoration:none; color:#000000;}
</style>

<body background="bac1.jpg">
 <form  action="LoginServlet"  method="post">
  <%@ include file="head.jsp" %>
  <div style="width:50px; margin-left:10px; margin-top:80px;height:30px;">
     <%@ include file="introduce.jsp" %>
  </div>
     <div style=" width:500px;margin-left:700px; margin-top:5px;height:400px;">       
        <fieldset><legend style="color: rgb(85, 85, 85);"><b>用户登录</b></legend>
        <table>
          <tr>
           <td>
            <label id="userna">&nbsp;&nbsp;&nbsp;用户名：</label>
            <input type="text" name="uid" id="uid" /><div style="CLEAR:both"></div><br>
            <label id="pass">&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
            <input type="password" name="userpass" tabindex="2"><div style="CLEAR:both"></div>
           <table id="RadioButtonList1" border="0">
	          <tr>
		        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="RadioButtonList1_0" type="radio" name="RadioButtonList1" value="管理员" tabindex="2" checked="checked" />
                    <label for="RadioButtonList1_0">管理员</label></td>
                <td>&nbsp;&nbsp;<input id="RadioButtonList1_1" type="radio" name="RadioButtonList1" value="客户" tabindex="2" />
                    <label for="RadioButtonList1_1">客户</label></td>
	         </tr>
           </table>  
           <div style="CLEAR:both"></div>&nbsp;&nbsp;&nbsp;&nbsp;
           <input type="submit" name="Button1" value="登录" id="Button1" class="btn_dl" />
	       <input type="submit" name="Button2" value="取消" id="Button2" class="btn_cz" onclick="window.close();return false;" />
           <span id="fail" style="color:red">${info}</span>
           <hr/><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;您还不是管理员？</span><br/>
           <a href="uremnew.jsp" style="color:#000000">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;创建一个新的管理员&gt;&gt;</a>
      </td>
    </tr>
    <tr></tr> 
  </table></fieldset>
 </div>
<%@ include file="foot.jsp" %>

 </form>
</body>
</html>
