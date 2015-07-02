package com.houzhuo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
/*	private static final long serialVersionUID = -8784956640082320791L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = req.getParameter("uname");
		String password = req.getParameter("upwd");

		System.out.println("用户名： " + userName);
		System.out.println("密码： " + password);
	}*/

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("-------------doget");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("-----------dopost");
		String userName = req.getParameter("uname");
		String password = req.getParameter("upwd");

		System.out.println("用户名： " + userName);
		System.out.println("密码： " + password);
		
		
		String forward = null;
		
		if (userName.equals("houzhuo") && password.equals("nlp")) {
			//请求转发，只能转发应用内地址
			forward = "/servlet/success.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);//请求调度器，封装了转发的操作
			rd.forward(req, resp);
			
			//请求重定向，可以转发到外部地址
			//resp.sendRedirect(req.getContextPath()+"/servlet/success.jsp");
		}else {
			forward = "/servlet/success.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			resp.sendRedirect(req.getContextPath()+"/servlet/error.jsp");
		}
		
	}

}
