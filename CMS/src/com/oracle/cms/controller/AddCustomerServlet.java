package com.oracle.cms.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.cms.domain.Customer;

@WebServlet(name="AddCustomerServlet", urlPatterns={"/admin/addcustomer.action"})
public class AddCustomerServlet extends HttpServlet {

	private static final long serialVersionUID = 851184703107683090L;

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 获取表单数据
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String profile = request.getParameter("profile");
		
		// 2. 校验
		List<String> errors = new LinkedList<String>();
		request.setAttribute("errors", errors);
		if(name == null || name.equals("")){
			errors.add("请输入姓名");
		}
		
		if(age == null || age.equals("")){
			errors.add("请输入年龄");
		}
		
		int ageInt = -1;
		try{
			ageInt = Integer.parseInt(age);	
		}catch(NumberFormatException ex){
			errors.add("年龄必须为整数");
		}
		
		if(ageInt < 18 || ageInt > 60){
			errors.add("年龄必须在18-60之间");
		}
		
		if(profile == null || profile.equals("")){
			errors.add("请输入个人简介");
		}
		
		// 3. 校验失败
		if(!errors.isEmpty()){
			request.getRequestDispatcher("/admin/AddCustomer.jsp").forward(request, response);
			return;
		}
		
		// 校验成功, 创建Customer对象并存储至request作用域, 转至成功页
		Customer customer = new Customer(name, gender, profile, ageInt);
		request.setAttribute("customer", customer);
		request.getRequestDispatcher("/admin/AddCustomerSucc.jsp").forward(request, response);
	}

}
