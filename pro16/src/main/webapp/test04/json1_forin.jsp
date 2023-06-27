<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

		<script>
			// parse(): JSON 문자열을 매개변수로서 수용하고, 일치하는 자바스크립트 객체로서 변환합니다.
			// stringify(): 객체를 매개변수로서 수용하고, JSON 문자열 형태로 변환합니다.

			$(function () {
				$('#checkJson').click(function () {
					let jsonStr = '{ "name": ["홍일동", "홍이동", "홍삼동"] }';
					console.log(jsonStr);
					//		$('#output').html(jsonStr); // 이건 안 됨

					let jsonInfo = JSON.parse(jsonStr);
					let out = "";
					
					// 이건 너무 마음에 안드는 방식
					for(let i in jsonInfo.name) { 
						console.log(i + " 콘솔 i찍은거")		
						out += jsonInfo.name[i]; // for in 으로 하니까 객체로 받아와서 또 제이슨 인포를 참조해 네임을 접근해 i를 뽑아온다 결국 i는 인덱싱 넘버임
					}
					$('#output').html(out);

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