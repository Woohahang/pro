<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
request.setAttribute("sdasdab", "nice");

session.setAttribute("kkkksskkkww", "session nice!!");

application.setAttribute("mmmnnnmm", "이건 에플리케이션이다. 앱은 프로14 걍 나오는거 그거 nice!!");
application.setAttribute("sss", "sss!");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:forward page="member2.jsp"></jsp:forward> <!-- 포워드는 보낸다. -->

<%
application.setAttribute("aaa", "sdasda");
%>

</body>
</html>