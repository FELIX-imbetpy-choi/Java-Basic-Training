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

	<form action = "A3_3CookieTest.jsp" method = "get">
	<h1>개인정보를 입력하세요</h1><br/>
	
	<table border = 0>
	<tr>
	<td align = "right">주소 : <input type = "text" name = "userAdr"><br/><td/>
	<tr/>
	<tr>
	<td align = "right">전화번호 : <input type = "text" name = "userTel"><br/></td>
	<tr/>
	<tr>
	<td align = "right">이메일 : <input type = "text" name = "userEma"><br/></td>
	<tr/>
	</table>
	<br/> 
	
	
	<input type = submit value = 확인>
	</form>
	
	<%
	String str1 = request.getParameter("userId");
	String str2 = request.getParameter("userPas");
	String str3 = request.getParameter("userName");
	
	response.addCookie(new Cookie("ID", URLEncoder.encode(""+str1+"","utf-8")));
	response.addCookie(new Cookie("PAS", URLEncoder.encode(""+str2+"","utf-8")));
	response.addCookie(new Cookie("NAME", URLEncoder.encode(""+str3+"","utf-8")));
	
	%>

</body>
</html>