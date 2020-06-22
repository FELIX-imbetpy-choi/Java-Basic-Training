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

	<form action = "A3_4CookieTest.jsp" method = "get">
	<h1>추가 정보를 입력하세요</h1><br/>
	
	<table border = 0>
	<tr>
	<td align = "right">생년월일 : <input type = "text" name = "userBir"><br/><td/>
	<tr/>
	<tr>
	<td align = "right">결혼여부 : <input type = "radio" name = "userMar" value = "미혼">미혼
			 					<input type = "radio" name = "userMar" value = "기혼">기혼<br/></td>
	<tr/>
	<tr>
	<td align = "right">직업 :	<select name = "userJob">
            					<option>학생</option>
            					<option>사업가</option>
            					<option>직장인</option>
           					 	<option>무직</option>
            					</select><br/></td>
	<tr/>
	</table>
	<br/> 
	
	<input type = submit value = 확인>
	</form>
	
	<%
	String str4 = request.getParameter("userAdr");
	String str5 = request.getParameter("userTel");
	String str6 = request.getParameter("userEma");
	
	response.addCookie(new Cookie("ADR", URLEncoder.encode(""+str4+"","utf-8")));
	response.addCookie(new Cookie("TEL", URLEncoder.encode(""+str5+"","utf-8")));
	response.addCookie(new Cookie("EMA", URLEncoder.encode(""+str6+"","utf-8")));
	
	%>

</body>
</html>