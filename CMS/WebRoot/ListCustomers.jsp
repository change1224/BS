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
                <td><h3>客户管理系统: 客户列表</h3></td>
            </tr>
        </table>
        <%
        	List<Customer> customers = new LinkedList<Customer>();
			customers.add(new Customer("卢佳", "男", "小超人", 33));
			customers.add(new Customer("马玥", "男", "大超人", 21));
			customers.add(new Customer("王建勇", "男", "钢铁侠", 26));
         %>
        <p>现有以下客户:</p>
        <table border='1' cellspacing='0' width='50%'>
        	<tr>
        		<th>姓名</th>
        		<th>年龄</th>
        		<th>性别</th>
        		<th>简介</th>
        	</tr>
        	<%for(Customer customer : customers){ %>
        	<tr height='35'>
        		<td align='center'><% out.println(customer.getName()); %></td>
        		<td><%= customer.getAge() %></td>
        		<td align='center'><%= customer.getGender() %></td>
        		<td><%= customer.getProfile() %></td>
        	</tr>
        	<%} %>
        </table>
        <a href='index.html'>回首页</a>
  </body>
</html>
