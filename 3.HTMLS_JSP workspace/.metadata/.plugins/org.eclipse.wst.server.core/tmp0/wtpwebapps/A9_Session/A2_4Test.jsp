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
		request.setCharacterEncoding("utf-8");
	
	%>

	
	<h2>회원 가입 결과</h2>
	
	가입 되었습니다.
	
	<h1>가입내용</h1>
	
	아이디 : <%=(String)session.getAttribute("ID") %><br/>
	패스워드 : <%=(String)session.getAttribute("PAS") %><br/>
	성명 : <%=(String)session.getAttribute("NAME") %><br/>
	
	<% session.invalidate(); %>
	
	

</body>
</html>