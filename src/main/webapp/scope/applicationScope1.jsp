<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>applicationScope1.jsp</title>
</head>
<body>
<%
	Integer num = (Integer)application.getAttribute("num");
	if (num == null) {
		application.setAttribute("num", 0);
	} else {
		application.setAttribute("num", ++num);
	}

%>

num = <%= application.getAttribute("num") %>


</body>
</html>