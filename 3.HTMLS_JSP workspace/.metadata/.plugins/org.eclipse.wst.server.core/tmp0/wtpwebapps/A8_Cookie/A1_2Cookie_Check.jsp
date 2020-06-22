<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 데이터 읽기</title>
</head>
<body>

<%	
	//쿠키 데이터를 불러옴 - 배열이라 하나씩 불러내야한다.
	//쿠키 데이터가 브라우저를 종료하면 같이 사라져버림 - 창을 죽이지 말고 불러내야 가져온다
	Cookie[] cookies = request.getCookies();
%>
	이름 : <%= getCookieValue(cookies, "NAME") %><br/>
	성별 : <%= getCookieValue(cookies, "GENDER") %><br/>
	나이 : <%= getCookieValue(cookies, "AGE") %><br/>

</body>
</html>

<%!
	//쿠키 값 가져오는 메소드
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