package com.houzhuo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Servlet implementation class LoginServlet17
 */
public class LoginServlet17 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet17() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String password = request.getParameter("upwd");
		String returnUrl = request.getParameter("return_url");

		System.out.println(uname);
		System.out.println(password);
		System.out.println(returnUrl);

		RequestDispatcher rd = null;
		if (uname == null || password == null) {
			request.setAttribute("msg", "用户名或密码为空");
			rd = request.getRequestDispatcher("/17/login.jsp");
			rd.forward(request, response);
		} else {
			if (uname.equals("houzhuo") && password.equals("123456")) {
				request.getSession().setAttribute("flag", "login_success");
				if (returnUrl != null) {
					rd = request.getRequestDispatcher(returnUrl);
					rd.forward(request, response);
					System.out.println("getRequestDispatcher(returnUrl)");
				} else {
					rd = request.getRequestDispatcher("/17/index.jsp");
					rd.forward(request, response);
					System.out.println("getRequestDispatcher(/17/index.jsp)");
				}

			} else {
				request.getSession().setAttribute("flag", "login_error");
				request.setAttribute("msg", "密码错误");
				rd = request.getRequestDispatcher("/17/login.jsp");
				rd.forward(request, response);
			}
		}
	}

}
