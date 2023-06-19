<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="sec02.ex01.*, java.util.*"%>


<%
request.setCharacterEncoding("utf-8");

String name = request.getParameter("name"); // getParameter(); 사용자가 입력한 데이터를 읽어 온다.

MemberVO memberVO = new MemberVO(); 

memberVO.setName(name); // memberVO 라는 클래스의 setName이라는 메서드에 사용자가 입력한 name 변수를 넣은거다.

MemberDAO dao = new MemberDAO();

List<MemberVO> list = dao.listMembers(memberVO);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border='1' width='800' align='center'>
		<tr align='center' bgcolor='#FFFF66'>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
			<td>이메일</td>
			<td>가입일자</td>
		</tr>
		<%
		for (int i = 0; i < list.size(); i++) {
			MemberVO vo = (MemberVO) list.get(i);
			String id = vo.getId();
			String pwd = vo.getPwd();
			String name_ = vo.getName();
			String email = vo.getEmail();
			Date joinDate = vo.getJoinDate();
		%>
		<tr align=center>
			<td><%=id%></td>
			<td><%=pwd%></td>
			<td><%=name_%></td>
			<td><%=email%></td>
			<td><%=joinDate%></td>
		</tr>

		<%
		}
		%>


	</table>

</body>
</html>