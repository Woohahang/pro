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
첫 번째 <br>
<c:forEach begin="1" end="10" var="i">
${i} <br>
</c:forEach>

<hr>

<c:forEach begin="1" end="10" var="i" step="2">
${i} <br>
</c:forEach>

<hr>
<!-- varStatus : 상태용 변수 -->
<c:forEach begin="1" end="10" var="i" varStatus="loop">
${i} : ${loop.index}<br>
</c:forEach>

<hr>

<!-- count : 반복 횟수 -->
<c:forEach begin="10" end="20" var="i" varStatus="dd">
${i} : 회전 수 ${dd.count} <br>
</c:forEach>

<hr>

<c:forEach begin="1" end="10" var="i" varStatus="qq">
${i} : ${qq.first} <br>
</c:forEach>

<hr>

<c:forEach begin="1" end="10" var="i" varStatus="qq">
${i} : ${qq.last} <br>
</c:forEach>

<hr>
<c:set var="tot" value="0"></c:set>

<c:forEach begin="1" end="10" var="i">
${tot = tot + i}
</c:forEach>

<hr>
마지막
<c:forEach begin="1" end="10" varStatus="j">
${j.index}
</c:forEach>

<c:forEach begin="1" end="10" var="i" varStatus="j">
${j.index}
</c:forEach>
</body>
</html>