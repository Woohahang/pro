<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="sec01.ex01.*, java.util.*"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:useBean id="map" class="java.util.HashMap" />


<%
map.put("id","hong1");
map.put("pw","123");
map.put("name","홍일동");
map.put("gender","남자");
%>


<c:set var="memberList" value="${list}" />
<c:set var="sdaadsasasad" value="${map}"></c:set>

<%-- <c:remove var="sdaadsasasad"/> --%> <!-- 지워버린다. 리무브 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${map} <br>
${map.name} <br>
<hr>
${sdaadsasasad} <br>
${sdaadsasasad.name} <br>

</body>
</html>