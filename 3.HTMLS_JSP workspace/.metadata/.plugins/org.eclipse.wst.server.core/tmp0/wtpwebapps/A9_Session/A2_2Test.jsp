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

	String str1 = request.getParameter("userId");
	String str2 = request.getParameter("userPas");
	String str3 = request.getParameter("userName");
	
	session.setAttribute("ID", str1);
	session.setAttribute("PAS", str2);
	session.setAttribute("NAME", str3);

%>
	<h1>약관</h1><br/>
	
	-----------------------------------------------------------<br/>
	
	1. 회원 정보는 웹사이트의 운영을 위해서만 사용합니다.<br/>
	
	2. 웹사이트의 정상 운영을 방해하는 회원은 탈퇴 처리 합니다.<br/>
	
	-----------------------------------------------------------<br/>
	
	위의 약관에 동의 하십니까?<br/>
	
	
	<form action = "A2_3Test.jsp">
	 <input type = "radio" name = "userMar" value = "1">동의
	 <input type = "radio" name = "userMar" value = "2">동의하지 않음<br/>

	<br/>
	<input type = submit value = 확인> 
	</form>
	
</body>
</html>