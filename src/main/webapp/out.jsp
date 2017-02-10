<%@page import="java.io.IOException"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer="8kb"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out.jsp</title>
</head>
<body>
<h1>out 객체 동작 원리를 이해한다</h1>
<%
	for (int i=0; i<10; i++) {
		out.println("<h1> " + i + " out으로 출력된 문서는 Web Browser로 전송된다.</h1>");
		out.println("<h2>" + out.getRemaining() + "</h2>");
// 		out.flush();
// 		Thread.sleep(1000);
	}

%>
</body>
</html>