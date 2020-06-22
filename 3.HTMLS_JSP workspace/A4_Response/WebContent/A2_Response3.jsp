<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성인 사용자</title>
</head>
<body>
<%
	 String name;
	 name = request.getParameter("age");

%>

 법적으로 성인에 해당하는 <%=name %> 세 이므로 주류 구매가 가능합니다.

</body>
</html>