<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사칙연산</title>
<!-- 20181021 복습완료 ★ -->

</head>

<body>
<!-- 이전에는 get형식에서 변수가 나타나는 것을 이용해서 변수를 넘겨주었지만 
forward는 서버에 변수를 저장해서 넘겨준다. but 한번만 넘길 수 있다 -->
<!-- 이해하기 힘들다 변수가 넘어가는 과정 물어보기. -->

	<form action = "A4_2Forward.jsp" method = post>
	
	첫번째수 : <input type = test name = num1><br/>
	두번째수 : <input type = test name = num2><br/>
	
	<input type = submit value = 입력>
	
</form>

</body>
</html>