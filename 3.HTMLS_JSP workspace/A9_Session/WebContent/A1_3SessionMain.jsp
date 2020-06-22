<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성격 테스트 결과</title>
</head>
<body>

<%
	request.setCharacterEncoding("utf-8");

	String animal_T = request.getParameter("mons");
	session.setAttribute("ANIMAL", animal_T);

%>

당신은 <%=(String)session.getAttribute("FOOD") %>
와(과) <%=(String)session.getAttribute("ANIMAL") %>
을 좋아하는 성격입니다. <br/>

<% session.invalidate(); %>

</body>
</html>