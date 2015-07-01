<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 

String userName = request.getParameter("userName");
String password = request.getParameter("password");

if(userName!=null && password!= null){
	session.setAttribute("userName", userName);
	response.setHeader("refresh", "1;URL=welcome.jsp");
}
%>