<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext.jsp</title>
</head>
<body>
<%
	JspWriter xx = pageContext.getOut();
	xx.println("<h1> pageContext는 모든 내장객체를 소유하고 있다 </h1>");

%>

</body>
</html>