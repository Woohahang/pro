<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String age = request.getParameter("나이");
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=
Integer.parseInt(age) + 10
%>

<br>

<%=age + 10 %>
<!-- 여기 에러 걍 버그라고함 무시하고 실행하면 됨 -->
</body>
</html>