package com.houzhuo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class filterOne
 */

public class filterOne implements Filter {

    /**
     * Default constructor. 
     */
    public filterOne() {
        // TODO Auto-generated constructor stub
    	System.out.println("=========FilterOne构造函数========");
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("========FilterOne初始化=========");//过滤器在容器启动的时候就执行，servlet初始化在servlet第一次被访问的时候
    	String initParam = fConfig.getInitParameter("param");
    	System.out.println("param=="+ initParam);
    }
	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		//执行具体业务逻辑
		// pass the request along the filter chain
		System.out.println("=========FilterOne开始dofilter方法========");
		chain.doFilter(request, response);
		System.out.println("=========FilterOne结束dofilter方法========");
	}
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("=========销毁函数========");
	}

}
