<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
serverInfo: <%= application.getServerInfo() %><br/>
appName: <%= application.getServletContextName() %><br/>
hostName: <%= application.getVirtualServerName() %><br/>
</body>
</html>

<!-- 生命周期直到网页被销毁 ，可统计在线人数-->