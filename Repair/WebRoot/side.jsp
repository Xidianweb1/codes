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
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>

<body background="bac9.jpg">
<div>
    <p style="font-size:24px"><b>公司简介&gt;&gt;</b></p>
    <p>
	<marquee direction='up' scrolldelay='100' scrollamount='2' truespeed onMouseOver='this.stop()'
			 onMouseOut='this.start()' height='200' width="180">
							&nbsp;&nbsp;XD坐落于古都西安。是中国“建筑老八校”之一，原中华人民共和国冶金部重点建设高校。<br /> 
                            &nbsp;&nbsp;1956年全国第三次高等学校院系调整时，学校由原东北工学院、西北工学院、青岛工学院和苏南工业专科学校的建筑、土木、市政类系（科）合并而成，时名西安建筑工程学院。 <br/> 
							&nbsp;&nbsp;1959年和1963年，先后易名为西安冶金学院、西安冶金建筑学院，简称西冶。1994年3月，经原国家教委批，更名为西安建筑科技大学。2011年9月设立研究生院。
							<br /> 官方群一：<font color="red">124588807</font> <br /> 官方群二:
							<font color="red">1625009</font> <br /> 官方群三： <font color="red">143980285</font>
							<br /> 官网链接： <a
								href="http://tieba.baidu.com/f?kw=%C4%CF%D1%F4%C0%ED%B9%A4%D1%A7%D4%BAacmicpc"
								target="_blank">XD公司</a> <br />
	  </marquee>
      </p>
					</div>
</body>
</html>
