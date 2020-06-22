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

<%=session.getAttribute("ID") %> 님의 정보가 삭제 되었습니다.


<% session.invalidate(); %>

</body>
</html>