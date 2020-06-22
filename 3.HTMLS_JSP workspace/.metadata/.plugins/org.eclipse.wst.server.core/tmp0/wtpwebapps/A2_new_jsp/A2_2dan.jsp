<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 2단</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

	<%	
	int i = 0;
	while ( true ){
		i++;
		out.println("2 X "+ i + "=" + (2*i));
	}
	 %>
	<br/>
===========================================<br/>

<%
	if(i >= 9){
		break;
	}

%>
</html>