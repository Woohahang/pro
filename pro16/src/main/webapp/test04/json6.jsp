<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

<script>
	$(function() {
		$('#checkJson').click(function() {
			let _jsonInfo = '{"name":"박지성","age":"25","gender":"남자","nickname":"날센돌이"}';

			// ajax 란? Asynchronous Javascript(비동기 자바스크립트) + XML의 의미로 자바스크립트를 사용한 비동기 통신, 즉 클라이언트와 서버 간의 XML이나 JSON 데이터를 주고받는 기술
			$.ajax({
					type: "post",
					async: "true",
					url: "${contextPath}/json2",
				
				success : function (data, textStatus) {
				// 여기서 data 에 들어오는 인수는 url 에서 받는 데이터를 data 매개변수에 넣는다. ajax 특징인듯?
				console.log("자료:",data);
				console.log("자료:",typeof(data));
				
				let jsonData=JSON.parse(data);
//				console.log("자료:",jsonData);
//				console.log("타입:",typeof(jsonData));
				
				var memberInfo ="회원 정보<br>";
								
					memberInfo += "=======<br>";

				 for(let i of jsonData.mamber){
					memberInfo += "이름2: " + i.name+"<br>";
					memberInfo += "나이2: " + i.age+"<br>";
				}

				$("#output").html(memberInfo);

				},
				error: function (data, textStatus) {
					alert("에러");
				},
				complete: function (data, textStatus) {
					
				},
			});
		});
	});
</script>


</head>
<body>
	<a id="checkJson" style="cursor: pointer"> 출력3</a>
	<div id="output"></div>
</body>
</html>