<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="list" class="java.util.ArrayList"></jsp:useBean>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
list.add("첫 번째");
list.add("두 번째");
list.add("세 번째");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${list[0]}

<hr>

<c:forEach var="i" items="${list}">
${i} <br>
</c:forEach>

<hr>

<c:forTokens items="hi,nice,ㅋㅋㅋ" delims="," var="i">
${i} <br>
</c:forTokens>

</body>
</html>