<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="num" value="50"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${num < 101 and num > -1}">
	<c:choose>
		<c:when test="${num>90}">A 학점</c:when>
		<c:when test="${num>80}">B 학점</c:when>
		<c:when test="${num>70}">C 학점</c:when>
		
		<c:otherwise>D 학점</c:otherwise>
	</c:choose>
</c:if>

</body>
</html>