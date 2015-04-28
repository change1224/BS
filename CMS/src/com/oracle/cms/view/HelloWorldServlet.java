package com.oracle.cms.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="helloworld", urlPatterns={"/hello.view"})
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 4999325744758083705L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>HelloWorld</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>HelloWorld</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	
	

}
