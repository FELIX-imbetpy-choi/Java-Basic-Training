<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

	<h><b>1부터 10까지의 합을 순서대로 구하세용</b></h><br/>
	
	<%
		int sum = 0;
		for(int i = 1; i <=10; i++ ){
			sum = sum + i;
			out.println(i+"---->"+sum);
	%>
	<br/>
	<% 
			
		}
	%>

</body>
</html>