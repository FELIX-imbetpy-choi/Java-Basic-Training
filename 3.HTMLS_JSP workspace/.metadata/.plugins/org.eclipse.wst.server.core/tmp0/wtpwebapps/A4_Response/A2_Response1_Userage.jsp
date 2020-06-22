<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 나이 입력</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<!-- point1. 변수를 어떻게 마지막까지 넘겨줄 것인가? -->
<!-- ip가 바뀌면 2번에서 실행이 안됨으로 변경이 필요하다 -->
<!-- 2번에서 get방식의 ?age 로 변수와 값을 지정해야 3번째로 넘어간다.>? -->
	주류 구매를 위해서 당신의 나이를 입력해 보세요!
	
	<form action = "A2_Response2.jsp" method = "get">
	
	나이!! : <input type = text name = age>
			<input type = submit value = "확인">
	
	
	</form>

</body>
</html>