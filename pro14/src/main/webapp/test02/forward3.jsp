<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="sec01.ex01.*, java.util.*"%>

<%
List<MemberBean> mlist  = new ArrayList<MemberBean>();

MemberBean member1 = new MemberBean("lee", "1234", "이순신", "lee@naver.com");
MemberBean member2 = new MemberBean("son", "1234", "손흥민", "son@gmali.com");

mlist.add(member1);
mlist.add(member2);

request.setAttribute("mlist", mlist);

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=mlist %> <br> <!-- 이건 주소가나온다. -->

<%=mlist.get(0) %> <br>
<%=mlist.get(0).getName() %> <br>

<%-- ${mlist } --%> <!-- 이건 걍 안 나온다. -->

<jsp:forward page="member3.jsp"></jsp:forward>


</body>
</html>