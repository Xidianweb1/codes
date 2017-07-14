<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.mldn.cn/jst/core" %>
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
<LINK href="css/style.css" rel="stylesheet" type="text/css">
  <LINK href="css/tmp.css" rel="stylesheet" type="text/css">
</head>
<style type="text/css">
 body {font-family:Verdana,Arial,Helvetica,sans-serif;font-size:12px;line-height:1.5;}
 img {border:0;}
  #menu ul {margin:0 auto; padding:0; list-style:none; width:1000px;}
  #menu ul li { background:#eee; height:37px; line-height:37px;
                border-bottom:1px solid #CCCCCC; text-align:center;
				float:left; width:154px; margin-right:10px;}
  #menu ul li a:hover { background:#000000; }
  
  #menu ul li ul  { display:none; width:154px; position:absolute;}
  #menu ul li.listshow ul { display:block;}
  
  #menu ul li ul li { float:none; width:154px; margin:0;}
  #menu ul li ul li a { background:none; width:154px;}
  #menu ul li ul li a:hover{ background:#000000; color:#FFFFFF;}
  .clear { clear:both;}
  a:hover{ text-decoration:none; color:#000000;}	
  a:link { text-decoration:none; color:#000000;}	
  a:visited { text-decoration:none; color:#000000;}
  span { font-size:18px; color:#FB070B;}
  a { font-size:16px; background:#8B8585;}
</style>

<script type="text/javascript">
function menuFix(){
	   var sfEles = document.getElementById("menu").getElementsByTagName("li");
	   for(var i = 0;i<sfEles.length; i++){
		   sfEles[i].onmouseover = function(){
			   this.className += (this.className.length>0?" ":"")+"listshow";
			}
			sfEles[i].onmouseout = function(){
			   this.className = this.className.replace("listshow",""); 
			}
		}
   }
	   window.onload = menuFix;
</script>

<body background="bac9.jpg">
  <center>
   <div id="menu" style="width:818px; margin-left:auto; margin-right:auto">
   <ul>
       <li><span>客户信息</span>
           <ul>
               <li  class="listshow"><a href="ucltnew.jsp" target="zhong">增&nbsp;&nbsp;加</a></li>
               <li  class="listshow"><a href="ucltsearch.jsp" target="zhong">更&nbsp;&nbsp;新</a></li>
           </ul>
       </li>
       <li><span>维修工程师信息</span>
           <ul>
               <li  class="listshow"><a href="urepnew.jsp" target="zhong">增&nbsp;&nbsp;加</a></li>
               <li  class="listshow"><a href="urepsearch.jsp" target="zhong">更&nbsp;&nbsp;新</a></li>
           </ul>
       </li>
       <li><span>系统用户信息</span>
           <ul>
               <li  class="listshow"><a href="uremsearch.jsp" target="zhong">查&nbsp;&nbsp;询</a></li>
               <li  class="listshow"><a href="MyUsertypeServlet?rem=${rem}" target="zhong">更&nbsp;&nbsp;新</a></li>
           </ul>
       </li>
       <li><span>故障报修记录</span>
           <ul>
               <li  class="listshow"><a href="ugoodssearch.jsp" target="zhong">查&nbsp;&nbsp;询</a></li>
               <li  class="listshow"><a href="#" target="zhong">更&nbsp;&nbsp;新</a></li>
           </ul>
       </li>
       <li><span>维修工程师调度</span>
           <ul>
               <li  class="listshow"><a href="uarrsearch.jsp" target="zhong">查&nbsp;&nbsp;询</a></li>
               <li  class="listshow"><a href="FindArGoServlet" target="zhong">调&nbsp;&nbsp;度</a></li>
           </ul>
       </li>
       <div class="clear"></div>
   </ul>
   
   </div>
   </center>
   <center>
   <div><a href="zhong.html"><img src="img3.png"></img></a></div>
   </center>


</body>
</html>
