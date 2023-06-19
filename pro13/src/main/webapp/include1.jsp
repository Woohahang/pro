<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
안녕하세요. 쇼핑몰 중심 JSP 시작입니다!!!
<br>
-----------------------------------<br>
<jsp:include page="duke_image.jsp"> <!-- 덕 이미지 페이지를 여기 공간 안에 불러오겠다. 라는 말 -->
<jsp:param value="./image/dog.jpg" name="dog"/>
<jsp:param value="./image/cat.jpg" name="cat"/>
<jsp:param value="./image/hedgehog.jpg" name="hedgehog"/>
</jsp:include>

<br>-----------------------------------
<br>
안녕하세요. 쇼핑몰 중심 JSP 끝 부분입니다.!!!
</body>
</html>