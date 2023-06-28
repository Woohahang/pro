<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<c:choose>
	<c:when test='${msg == "addMember"}'>
		<script>
			window.onload = function() {
				alert("회원 등록함");
			}
		</script>
	</c:when>
	<c:when test="${msg == 'modMember'}">	
		<script>
			window.onload = function() {
				alert("회원 수정함");
			}
		</script>
	</c:when>
	<c:when test="${msg == 'delMember'}">
		<script>
			window.onload = function() {
				alert("회원 삭제함");
			}
		</script>	
	</c:when>
</c:choose>





<style>
.cls1 {
	font-size: 40px;
	text-align: center;
}

.cls2 {
	font-size: 20px;
	text-align: center;
}
</style>

</head>
<body>

	<p class="cls1">회원정보</p>
	<table align="center" border="1">
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>이메일</b></td>
			<td width="7%"><b>가입일</b></td>
			<td width="7%"><b>수정</b></td>
			<td width="7%"><b>삭제</b></td>
		</tr>
		<c:choose>
			<c:when test="${empty membersList }">
				<tr>
					<td colspan=5 align="center"><b>등록된 회원이 없습니다.</b></td>
				</tr>
			</c:when>
			<c:otherwise>

				<c:forEach var="member" items="${membersList }">

					<tr align="center">

						<td>${member.id}</td>
						<td>${member.pwd }</td>
						<td>${member.name}</td>
						<td>${member.email }</td>
						<td>${member.joinDate}</td>
						<td><a
							href="${contextPath}/member/modMemberForm.do?id=${member.id}">수정</td>
						<td><a
							href="${contextPath}/member/delMember.do?id=${member.id}">삭제</td>

					</tr>
				</c:forEach>


			</c:otherwise>
		</c:choose>





	</table>

	<a href="${contextPath}/test03/memberForm.jsp"><p class="cls2">회원 가입하기</p></a>
</body>
</html>