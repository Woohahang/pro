<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String imgDog = request.getParameter("dog");
String imgCat = request.getParameter("cat");
String imgHedgehog = request.getParameter("hedgehog");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<img src="<%=imgDog%>">
	<img src="<%=imgCat%>">
	<img src="<%=imgHedgehog%>">


</body>
</html>