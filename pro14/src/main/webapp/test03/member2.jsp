<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="sec01.ex01.*, java.util.*"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:useBean id="list" class="java.util.ArrayList" />
<jsp:useBean id="map" class="java.util.HashMap" />


<%
MemberBean member1 = new MemberBean("son", "1234", "손흥민", "son@gmail.com");
list.add(member1);

MemberBean member2 = new MemberBean("hong1", "1235", "홍일동", "hong1@naver.com");
list.add(member2);

map.put("memberList", list);

%>


<c:set var="memberList" value="${list}" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${memberList }
<hr>
${memberList[0].id } <br>
${memberList[1].id } <br>
<hr>
${map.memberList[0].id}
<hr>

</body>
</html>