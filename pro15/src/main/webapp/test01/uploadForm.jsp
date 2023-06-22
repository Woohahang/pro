<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- enctype="multipart/form-data는 파일이 이미지일 때 반드시 폼 태그에 삽입해줘야 함 -->
	<form action="${contextPath}/upload.do" method="post" enctype="multipart/form-data">


		파일 1 : <input type="file" name="file1"> <br>
		파일 2:  <input type="file" name="file2"> <br>
		
		파라미터1: <input type="text" name="param1"> <br>
		파라미터2: <input type="text" name="param2"> <br>
		<input type="submit" value="파일 올리기"> <br>

	</form>

</body>
</html>