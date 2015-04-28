<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
                <td><h3>客户管理系统: 添加新客户</h3></td>
            </tr>
        </table>
        <%
        	List<String> errors = (List<String>)request.getAttribute("errors");
        	if(errors != null && !errors.isEmpty()){
        %>
        		<font color="red">
        			请更正以下错误：
        			<ul>
        				<%for(String error : errors) {%>
        					<li><%= error %></li>
        				<%} %>
        			</ul>
        		</font>
        <%
        	}
         %>
        <p>本页面用于添加新客户:</p>
        <form action="admin/addcustomer.action" method="post">
        	<%
        		String name = request.getParameter("name");
        		if(name == null){
        			name = "";
        		}
        	 %>
        	姓名: <input type="text" name="name" value="<%= name %>" /><br /><br />
        	<%
        		String age = request.getParameter("age");
        		if(age == null){
        			age = "";
        		}
        	 %>
        	年龄: <input type="text" name="age" value="<%= age %>" /><br /><br />
        	<%
        		String gender = request.getParameter("gender");
        		if(gender == null){
        			gender = "male";
        		}
        	 %>
        	性别: <input type="radio" name="gender" value="male" 
        		 <%
        		 	if(gender.equals("male")){
        		  %>
					checked        		  
        		  <%} %>
        		 />男
        		 <input type="radio" name="gender" value="female"
        		 <%
        		 	if(gender.equals("female")){
        		  %>
					checked        		  
        		  <%} %>
        		  />女<br /><br />
        		 
        	<%
        		String profile = request.getParameter("profile");
        		if(profile == null){
        			profile = "";
        		}
        	 %>
        	简介：<textarea name="profile" cols="30" rows="5"><%= profile %></textarea><br /><br />
        	<input type="submit" value="添加新客户" /> 
        </form>
  </body>
</html>
