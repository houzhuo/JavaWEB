<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page buffer="10kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("houzhuo");
out.print("diao");
out.newLine();
out.println("<br/>");
out.flush();
out.clearBuffer();
out.clear();//在flush之后会出现异常
out.println("getbufferSize: "+ out.getBufferSize());
out.println("<br/>");
out.println("get remaining byte: "+ out.getRemaining());
%>

</body>
</html>