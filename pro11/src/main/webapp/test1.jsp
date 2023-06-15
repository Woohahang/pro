<!-- %@ 디렉티브라고함 지시하다. -->
<!-- jsp 파일이 컴파일 되는 경로 D:\hyeonwoo\eclipse_java\hyeonwoo\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\pro11\org\apache\jsp -->
<!-- 여기 안에 hi 하나를 만들기 위한 많은 코드가 적혀 있다 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 여기서 자바를 쓴다고?
이렇게 쓰는거다 %! 이게 선언해주겠다 이거임  --> 

<!-- 선언해주는거다. 이걸! 스크립트 렛! 이라고 부른다 ! -->
 <%! String name="홍길동";
 	 int age=30;
 %>
 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hi<br>

<!-- 변수를 불러오는 것 이걸 표현식이라고 한다! -->
이름 : <%=name%><br>
나이 : <%=age%>
</body>
</html>