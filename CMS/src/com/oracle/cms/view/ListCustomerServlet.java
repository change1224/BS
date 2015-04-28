package com.oracle.cms.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.cms.domain.Customer;

public class ListCustomerServlet extends HttpServlet {

	private static final long serialVersionUID = -5237742869546769704L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Customer> customers = new LinkedList<Customer>();
		customers.add(new Customer("卢佳", "男", "小超人", 33));
		customers.add(new Customer("马玥", "男", "大超人", 21));
		customers.add(new Customer("王建勇", "男", "钢铁侠", 26));
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
		out.println("<html>");
		out.println("  <head>");
		out.println("    <title>客户管理系统</title>");
		out.println("    <meta http-equiv='keywords' content='keyword1,keyword2,keyword3'>");
		out.println("    <meta http-equiv='description' content='this is my page'>");
		out.println("    <meta http-equiv='content-type' content='text/html; charset=UTF-8'>");
		out.println("  </head>");
		out.println("  ");
		out.println("  <body bgcolor='white'>");
		out.println("        <!-- Page Heading -->");
		out.println("        <table border='1' cellpadding='5' cellspacing='0' width='400'>");
		out.println("            <tr bgcolor='#CCCCFF' align='center' valign='middle' height='20'>");
		out.println("                <td><h3>客户管理系统: 客户列表</h3></td>");
		out.println("            </tr>");
		out.println("        </table>");
		out.println("        <p>现有以下客户:</p>");
		out.println("        <table border='1' cellspacing='0' width='50%'>");
		out.println("        	<tr>");
		out.println("        		<th>姓名</th>");
		out.println("        		<th>年龄</th>");
		out.println("        		<th>性别</th>");
		out.println("        		<th>简介</th>");
		out.println("        	</tr>");
		for(Customer customer : customers){
			out.println("        	<tr height='35'>");
			out.println("        		<td align='center'>" + customer.getName() + "</td>");
			out.println("        		<td>" + customer.getAge() + "</td>");
			out.println("        		<td align='center'>" + customer.getGender() + "</td>");
			out.println("        		<td>" + customer.getProfile() + "</td>");
			out.println("        	</tr>");
		}
		out.println("        </table>");
		out.println("        <a href='index.html'>回首页</a>");
		out.println("    </body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

}
