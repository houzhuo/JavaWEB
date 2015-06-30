<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处理信息</title>
</head>
<body>
<jsp:useBean id="user" class="com.houzhuo.entity.UserEntity"></jsp:useBean>
<jsp:setProperty property="userName" name="user"/>
<jsp:setProperty property="password" name="user"/>
	<%
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		out.println(username);
		out.println("<br/v>");
		out.println(password);
	%>
<br/>
<br/>
<jsp:getProperty property="userName" name="user"/>
<br/>
<jsp:getProperty property="password" name="user"/>
</body>
</html>