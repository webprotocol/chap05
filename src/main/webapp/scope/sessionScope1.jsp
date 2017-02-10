<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionScope1.jsp</title>
</head>
<body>
<%
	Integer num1 = (Integer)session.getAttribute("num1");
	if (num1 == null)
		session.setAttribute("num1", 0);
	else
		session.setAttribute("num1", ++num1);
%>

num = <%=application.getAttribute("num") %> <br>
num1 = <%=session.getAttribute("num1") %>

</body>
</html>