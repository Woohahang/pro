<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!String name = null;
/* 
String getName() {
	return name;	
}
*/
%>

<%
name = request.getParameter("이름");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
<%= getName() %>
 --%>
<%= name %> <br>
<% out.print(name); %>


</body>
</html>