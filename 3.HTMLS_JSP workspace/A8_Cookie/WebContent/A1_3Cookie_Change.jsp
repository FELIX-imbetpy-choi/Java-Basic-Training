<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 데이터 수정</title>
</head>
<body>

<%
	//수정과 입력이 같다? 새로 입력을 해버리는 것
	// 1번 실행하고 2번 확인 3번 실행하고 다시 2번을 통해서 확인 해 보면 값이 수정되어 있다.
	response.addCookie(new Cookie("AGE","10"));

%>

</body>
</html>