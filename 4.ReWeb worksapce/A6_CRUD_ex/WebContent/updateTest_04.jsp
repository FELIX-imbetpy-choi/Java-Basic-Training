<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>수정결과</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

%>

사용자 ID : <%=(String)session.getAttribute("ID") %><br/>
성명 : <%=(String)session.getAttribute("NAME") %><br/>
전화번호 : <%=(String)session.getAttribute("TEL") %><br/>
주소 : <%=(String)session.getAttribute("ADDRESS") %><br/>

<% session.invalidate(); %>

</body>
</html>