<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

<script>

//	$(document).ready(function() {
//		$(function() {
//			$('#checkJson').click(function() {
//				alert("hi");
//			});
//		});
//	});

// 다큐먼트 레디를 생략해 아래 처럼 쓸 수 있다.

	$(function() {
		$('#checkJson').click(function() {
			alert("bye");
		});
	});
</script>


</head>
<body>
	<a id="checkJson" style="cursor: pointer"> 출력3</a>
	<!-- <a id="checkJson"  > 출력</a> -->

	<div id="output"></div>
</body>
</html>