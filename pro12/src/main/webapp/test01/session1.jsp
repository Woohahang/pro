<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="javax.servlet.*" %>
<%
/* String str = (String) session.getAttribute("name"); */

/* session.setAttribute("address", "미금역"); */

/* application.setAttribute("메뉴", "닭갈비"); */
// 어플리케이션은 주소 걍 다이렉트로 팍 찍어도 닭갈비 나옴

request.setAttribute("nightMenu", "치킨");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hi

	<%--<%=str%> --%>
	<br>

	<%
	/* out.print(str); */
	%>

	<!-- <a href='/pro12/test01/session2.jsp'>이동</a> -->


	<%
	RequestDispatcher dispatcher = request.getRequestDispatcher("session2.jsp");
	
	dispatcher.forward(request, response);
	%>

</body>
</html>