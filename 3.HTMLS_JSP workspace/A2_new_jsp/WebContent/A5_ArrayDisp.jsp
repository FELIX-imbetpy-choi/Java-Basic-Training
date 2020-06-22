<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ArrayDisp</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<!-- + Arrays.toString 을 선언해야 배열을 불러올 수 있다. 
ctrl space눌러야 유틸이 import된다 -->

<%
	int []iArr = {10,20,30};
	out.println(Arrays.toString(iArr));
%>

</body>
</html>