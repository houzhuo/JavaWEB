<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>可以访问任何对象</title>
</head>
<body>
<%
	JspWriter myOut = pageContext.getOut();
	myOut.print("hello world");
	
	pageContext.setAttribute("houzhuo", "nlp",pageContext.SESSION_SCOPE);
	
	String value = session.getAttribute("houzhuo").toString();
	out.println(value);
	out.println("<br/>");

%>
</body>
</html>

<!-- setAttribute,getAttribute重要方法 -->