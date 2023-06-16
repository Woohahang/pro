<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
/* String name = (String) session.getAttribute("name");
String address = (String) session.getAttribute("address"); */

/* String menu = (String) application.getAttribute("메뉴"); */

String nightMenu = (String) request.getAttribute("nightMenu");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%=name%>
	<%=address%> --%>

	<%-- <%=menu%> --%>
	
	<%=nightMenu %>

</body>
</html>