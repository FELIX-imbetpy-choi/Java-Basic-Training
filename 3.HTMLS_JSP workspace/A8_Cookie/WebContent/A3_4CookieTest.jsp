<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Cookie[] cookies = request.getCookies();
%>

	<h1>^_- 가입 내용</h1><br/>
	
	<br/>
	
 	아이디  : <%= getCookieValue(cookies, "ID") %><br/>
 	패스워드  : <%= getCookieValue(cookies, "PAS") %><br/>
 	이름  : <%= getCookieValue(cookies, "NAME") %><br/>
 	주소  : <%= getCookieValue(cookies, "ADR") %><br/>
 	전화번호  : <%= getCookieValue(cookies, "TEL") %><br/>
 	이메일  : <%= getCookieValue(cookies, "EMA") %><br/>
 	생년월일   : <%= request.getParameter("userBir") %><br/>
 	결혼여부  :  <%= request.getParameter("userMar") %><br/>
 	직업  :  <%= request.getParameter("userJob") %><br/>

	<br/>-----------------------------------------------

	<h1>상기의 조건으로 가입이 되었습니다. 감사합니다!</h1><br/>
	
	<br/>-----------------------------------------------

</body>
</html>

<%!
	//앞에는 쿠키 배열이고 뒤에는 name값이 들어오도록 해야
	private String getCookieValue(Cookie[] cookies,String name){
		if(cookies == null) return null;
		// : cookies에 들어오는 값을 cookie라는 변수에 넣어서 쓰겠다라는 의미 - 최근에 추가된 방식
		for(Cookie cookie : cookies){
			if (cookie.getName().equals(name)){
				//return cookie.getValue();
				// 아래처럼 써야 한글이 읽어진다.
				return URLDecoder.decode(cookie.getValue());
			}
		}
		return null;
}


%>



</body>
</html>