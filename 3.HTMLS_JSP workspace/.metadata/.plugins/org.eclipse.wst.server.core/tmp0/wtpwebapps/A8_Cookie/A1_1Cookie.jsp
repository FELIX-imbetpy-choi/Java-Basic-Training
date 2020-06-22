<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 데이터 저장하기</title>
<!-- 작석날짜 2018.10.22 -->

</head>

<body>

<%
	//Cookie cookie = new Cookie("NAME", "Choi"); // 보통 쿠키에서는 변수를 대문자로 작성한다 , 뒤에는 변수이름
	//response.addCookie(cookie);		
	//위의 내용을 한번에 작성한 것이 아래있는 방식이다
	
	response.addCookie(new Cookie("NAME","Choi"));
	response.addCookie(new Cookie("GENDER","Male"));
	response.addCookie(new Cookie("AGE","99"));
	//여기까지 저장됨
	
	String food_T = request.getParameter("food");
    response.addCookie(new Cookie("FOOD", URLEncoder.encode("food_T, utf-8")));
    
%>

쿠키 데이터가 저장되었습니다.

</body>
</html>