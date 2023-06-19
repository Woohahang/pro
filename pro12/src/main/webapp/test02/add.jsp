<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="addException.jsp"%>


<%
String num = request.getParameter("num");
// getParameter(); 사용자가 입력한 데이터를 가지고 올 수 있다.

int number = Integer.parseInt(num);
// parseInt(num); 문자 타입의 숫자를 숫자타입으로 변환.

int sum = 0;
for (int i = 1; i <= number; i++) {
	sum = sum + i;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>합계 구하기</title>
</head>
<body>
	<h2>합계 구하기</h2>
	<h1>
		1부터
		<%=num%>까지의 합은
		<%=sum%>입니다.
	</h1>

</body>
</html>