<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%-- <fmt:setLocale value="ko_KR"/> --%>
<fmt:setLocale value="en_US"/>


<h1>
 회원정보3<br><br>
 <fmt:bundle basename="resource.member">
 	이름:<fmt:message key="mem.name"></fmt:message>
 	주소:<fmt:message key="mem.address"></fmt:message>
 	직업:<fmt:message key="mem.job"></fmt:message>
 
 </fmt:bundle>
 </h1>

</body>
</html>