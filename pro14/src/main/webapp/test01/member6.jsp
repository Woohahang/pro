<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="sec01.ex01.*"%>

<jsp:useBean id="member" class="sec01.ex01.MemberBean">
	<jsp:setProperty property="*" name="member" />
</jsp:useBean>

<jsp:useBean id="address" class="sec01.ex01.Address">
	<jsp:setProperty property="city" name="address" value="성남" />
	<jsp:setProperty property="zipcode" name="address" value="13126" />
</jsp:useBean>

<%
member.setAddress(address);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=member.getAddress().getCity()%>
	<br> ${member.address.city}

	<hr>
	<%=member.getAddress().getZipcode()%>
	<br> ${member.address.zipcode}
</body>
</html>