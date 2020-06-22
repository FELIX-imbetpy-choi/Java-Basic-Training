<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>미성년 사용자</title>
</head>
<body>
<%
	 String name;
	 name = request.getParameter("age");

%>

	법적으로 주류구매가 불가능한  <%=name %> 세 이므로 접근할 수 없습니다.

</body>
</html>