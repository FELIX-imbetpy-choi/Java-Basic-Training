<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.lang.reflect.Array"%>
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
	//어떻게 돌아가는 거지?
	GregorianCalendar now  = new GregorianCalendar();
	String date = String.format("%TF", now);
	String time = String.format("%TT", now);
	
%>

	오늘의 날짜 ; <%= date %>
	현재 시각 : <%= time %>
	


</body>
</html>



