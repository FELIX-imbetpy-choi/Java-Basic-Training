<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사칙연산 결과</title>
</head>
<body>
	<!-- SetAttribute 해놓은 변수값을 가지고 오는 작업 -->
	덧셈		: <%=request.getAttribute("ADD") %>
	뺄셈		: <%=request.getAttribute("SUB") %>
	곱셈		: <%=request.getAttribute("MUL") %>
	나눗셈	: <%=request.getAttribute("DIV") %>

</body>
</html>