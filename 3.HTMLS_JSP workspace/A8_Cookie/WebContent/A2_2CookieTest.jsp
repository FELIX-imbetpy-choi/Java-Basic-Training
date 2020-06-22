<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<h>좋아하는 동물은?</h>

<form action = "A2_3CookieTest.jsp" method = "get">
	
	
	<input type = "text" name = "mons"><br/>
	
	<input type = submit value = 확인>
</form>


<%
	String str1 = request.getParameter("food");
	
	response.addCookie(new Cookie("FOOD", URLEncoder.encode(""+str1+"","utf-8")));
	
%>


	



</body>
</html>