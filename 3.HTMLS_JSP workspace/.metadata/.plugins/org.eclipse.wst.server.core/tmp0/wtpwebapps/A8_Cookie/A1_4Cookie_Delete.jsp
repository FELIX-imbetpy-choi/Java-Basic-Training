<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 데이터 삭제</title>
</head>
<body>
<%
	//쿠키 데이터를 삭제 하지 않으면 소스가 노출되어 해킹의 대상이 될 수 있음
	Cookie cookie = new Cookie("GENDER","");
	//쿠키 데이터 수명을 0초로 바꾸는 것이다.
	cookie.setMaxAge(0);
	//정리되고 
	response.addCookie(cookie);

%>

</body>
</html>