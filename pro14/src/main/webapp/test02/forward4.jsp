<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setAttribute("id", "hong");
session.setAttribute("id2", "hong");
application.setAttribute("id3", "hong");
/* 위에 키 값을 왜 여러개 했냐? 키 값은 하나만 된다. 그래서 구분해놓은거다. */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="member4.jsp"></jsp:forward>

</body>
</html>