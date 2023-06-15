<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
String name = null;
int age = 0;
%>

<%
name = request.getParameter("이름");
age = Integer.parseInt(request.getParameter("나이"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= name %> <br>
<%= age+10 %>

</body>
</html>