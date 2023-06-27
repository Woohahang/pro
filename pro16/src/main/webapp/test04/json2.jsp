<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

	<script>
			// parse(): JSON 문자열을 매개변수로서 수용하고, 일치하는 자바스크립트 객체로서 변환합니다. // 이건 JSON 문자열을 자바스크립트 객체로 바꿈
			// stringify(): 객체를 매개변수로서 수용하고, JSON 문자열 형태로 변환합니다.   // 요건 자바스크립트 문자열을 JSON 객체로 바꿈

			$(function () {
				$('#checkJson').click(function () {
					let jsonStr = '{ "name": ["홍일동", "홍이동", "홍삼동"] }'; // 배열을 문자열로 넣은 이유? 아래 parse를 쓰려면 문자열로 넣어야 되어서 그럼
					console.log(jsonStr);
//					console.log(jsonStr.name[0]); // 이건 아직 안 된다.					
					let jsonInfo = JSON.parse(jsonStr); // 이걸 써줌으로 jsonStr이라는 문자열을 자바스크립트 객체로 변환 됨
					console.log(jsonInfo.name[0]);
				});
			});
		</script>

</head>

<body>
		<a id="checkJson" style="cursor: pointer"> 출력3</a>
</body>
</html>