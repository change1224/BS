<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.oracle.cms.domain.Customer"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>客户管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <!-- Page Heading -->
        <table border='1' cellpadding='5' cellspacing='0' width='400'>
            <tr bgcolor='#CCCCFF' align='center' valign='middle' height='20'>
                <td><h3>客户管理系统: 添加新客户成功</h3></td>
            </tr>
        </table>
        <%
        	Customer customer = (Customer)request.getAttribute("customer");
         %>
        <p>您添加 <i><%= customer.getName() %></i> 的客户请求已成功。</p>
       <a href='index.html'>回首页</a>
  </body>
</html>
