
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<%
	Cookie[] cookies = request.getCookies();

	String str2 = request.getParameter("mons");
	response.addCookie(new Cookie("MONS", URLEncoder.encode(""+str2+"","utf-8")));
%>

	
 	좋아하는 음식 :<%= getCookieValue(cookies, "FOOD") %>
 	좋아하는 동물 : <%= request.getParameter("mons") %>
 	



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