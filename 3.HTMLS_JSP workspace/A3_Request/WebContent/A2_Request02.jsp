<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반갑습니다.</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<!-- 정보를 요청할때 문자변환 형식을 정해줘야 한글이 깨지지 않고 전달 받는다. -->
	<%
	request.setCharacterEncoding("utf-8");
	%>

<!-- 앞의 변수 선언에서는 따옴표가 필요 없지만 요청시에는 "strname" 이라고 표시를 해줘야 값을 불러들인다. -->

	안녕하세요, <%=request.getParameter("strname") %>
 	당신의 ID는 , <%=request.getParameter("strid") %>


</body>
</html>