<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!-- isELIgnored="false" Expression Language 를 어떻게 하겠냐? 표현식을 어떻게 하겠냐 이거임
false 가 표현식을 무시해라 걍 써진다는거
 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	${5}
	<br> ${5+8-7}
	<br> hi
	<br> ${"hi"}
	<br> ${'hi'}
	<br> ${"'hi'"}
	<br> <%-- ${'"hi"'} 이건 되는데 빨간줄 보기 싫어서 가림 --%>
	<br>
	<%-- ${"hi" + "nice"} 이건 안 된다. 왜?? 표현식에서 문자열을 더할 수 없다고 에러가 난다. --%>

	<br> ${null}
	<!-- null은 안 보인다. -->
	<br> ${null + 10}

	<br> ${true}
	<br> ${true || false}
	<br> ${false || true}
	<br> ${false && true}
	<br> ${false and true}
	<br> ${false or true}

	<hr>

	<br> ${1==1}

	<hr>

	<!-- empty 비어있다 라는 불린 반환하는거 -->
	<br> ${empty "" }
	<br> ${empty 0 }
	<br> ${empty 1 }

	<br> ${100 /0}
	<br> ${0 / 100}



</body>
</html>