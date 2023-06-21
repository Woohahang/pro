<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

<%-- <%
List mlist = (List)request.getAttribute("mlist");
%>  --%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 	<%=mlist%> <br>
	
	<%=mlist.get(0) %> --%>
	
	<hr>

	${mlist[0].id } <br>
	${mlist[1].id } <br>
	${mlist[0].name }

</body>
</html>