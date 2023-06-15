<!-- 이게 지시하는 디렉티브 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 이게 선언 -->
<%!String name = "홍길도동";
	int age = 30;%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 이게 표현식 -->
	<%=name%>
	<%=age%>

	<br>

	<% for (int i = 1; i <= 10; i++) { %>
	<% if(i%2 == 1) { %>
	<%=i %>
	<%} %>
	<%} %>


</body>
</html>