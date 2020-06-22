<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h>상품 선택 저장 결과<h>

저장 되었습니다.

<%=request.getAttribute("ANT") %>
<%=request.getAttribute("SIZ") %>
<%=request.getAttribute("COL") %>



<form action = "A5_4Test.jsp" method = "get">

<input type = submit value = 저장 결과 불러오기 >
 
 
 



</body>
</html>