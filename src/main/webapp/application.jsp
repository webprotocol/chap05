<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application.jsp</title>
</head>
<body>
<ul>
	<li>dbms = <%= application.getInitParameter("dbms") %> </li>
	<li>url = <%= application.getInitParameter("url") %> </li>
	<li>greet = <%= application.getInitParameter("greet") %> </li>
</ul>
<%
	Enumeration<String> pName = application.getInitParameterNames();
	
	while(pName.hasMoreElements()) {
		String name = pName.nextElement();
		String value = application.getInitParameter(name);
		out.println(name + " : " + value + "<br>");
	}
%>
<br>
<%
	Enumeration<String> hName = request.getHeaderNames();

	while (hName.hasMoreElements()) {
		String name = hName.nextElement();
		String value = request.getHeader(name);
		
		out.println(name + " : " + value + "<br>");
	}

%>
<br>

application.properties = <%= application.getRealPath("/application.properties") %> <br>
index.jsp = <%= application.getRealPath("/index.jsp") %><br>














</body>
</html>