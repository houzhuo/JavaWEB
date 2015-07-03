<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- charset=ISO-8859-1 -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
JSP表达式输出： <%= "hello world 3" %>
<br/>
<%!
	String str = "hello world 2你好 ";//全局变量
%>
<%
	//String str = "hello world";
	out.println(str);
	
%>
<!-- this is a html comments -->
<%-- this is a JSP comments --%>

</body>
</html>