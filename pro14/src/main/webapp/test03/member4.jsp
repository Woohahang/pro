<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="true">
true 나오나?
</c:if>

<c:if test="false">
false 나오나?
</c:if>

	<hr>

	<c:choose>
		<c:when test="ㄻㄴ여ㅗㅑㅡㅗㅑ">참이면 이게 나오고</c:when>
		<c:otherwise>거짓말이면 이게 나온다.</c:otherwise>
	</c:choose>

	<hr>

</body>
</html>