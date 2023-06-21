<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%-- <c:set var="id" value="hong"></c:set>

<c:set var="num" value="${5}"></c:set>

<c:set var="str" value="${'hi'}"></c:set>

<c:set var="str2" value='${"hi2"}'></c:set>

<c:set var="str3" value='hi3'></c:set>

<c:set var="str4" value='${hi4 }'></c:set> --%> <!-- 이건 안 나온다. 문자열 출력하고 싶으면 따움표 넣어야한다. -->

<!-- 이런 방법도 있고 -->
<c:set var="memberForm" value="memberForm.html"></c:set>

<!-- 이런 방법도 있다. -->
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<!-- 위에 저 링크는 pro14가 나온다. -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- ${id } <br>
${num } <br>
${str } <br>
${str2 } <br>
${str3 } <br>
${str4 } <br> --%>

<!-- <a href="memberForm.jsp">회원가입하기</a> -->


<a href="${memberForm }">회원가입하기2</a>

<a href="/pro14/test03/memberForm.html">회원가입하기3</a>

<a href="${contextPath}/test03/memberForm.html">회원가입하기4</a>

</body>
</html>