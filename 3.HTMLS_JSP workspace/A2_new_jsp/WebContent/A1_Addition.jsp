<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 활용 - html 과 jsp 의 반복된 활용 익히기 </title>
<!-- 20181021 복습완료 ★ -->
<!-- https://programmingsummaries.tistory.com/74 선언문 참교자료 -->

</head>
<body>
	
	<!-- + jsp 작성 - 페이지 소스를 확인하면 HTML만 표시되고  JSP코드는 보이지 않는다.-->
	
	<p>다음의 내용은 더하기 위한 샘플입니다.</p><br/>
	
	<!-- 괄호% 안에는 java 가 돌아간다 - 구분하는 표시만할뿐 코드는 완전히 독립적으로 흘러간다고 생각하면 된다. -->
	<%
	int a = 10;
	int b = 30;
	int addition = a + b;
	%>
	
	<!-- 괄호 %= 표시는 값이 하나만 나오는? 다시 알아봐 -->
	<%=a%> + <%=b %> = <%= addition %>

</body>
</html>