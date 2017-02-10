<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<style type="text/css">
	/*
	h1 {
		border: 1px solid red;
	}
	*/
	h1[onclick] {
		border: 1px dotted yellow;
	}
	
	.scope {
		color: red;
		font-size: 1.5em;
		font-weight: bolder;
	}
	
</style>
</head>
<body>
<h1 onclick="changeColor(event)">내장객체 9가지</h1>
<!-- 내장객체 9가지 리스트 -->
<ol>
	<li class="scope">request(영역객체)</li>
	<li>response</li>
	<li class="scope">pageContext(영역객체)</li>
	<li class="scope">session(영역객체)</li>
	<li class="scope">application(영역객체)</li>
	<li>out</li>
	<li>page</li>
	<li>config</li>
	<li>exception</li>
</ol>


<script type="text/javascript">
	/*
		changeColor
		h1 백그라운드 색을 변경한다.
	*/
	function changeColor(event) {
// 		var target = event.target;
// 		target.style.backgroundColor = "red";
		event.target.style.backgroundColor = "blue";
	}

</script>
</body>
</html>