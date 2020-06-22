<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 정보</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<%

	out.println("Sever : "+request.getServerName()+"<br/>");
	out.println("Port : "+request.getServerPort()+"<br/>");
	out.println("요청방식 : "+request.getMethod()+"<br/>");
	out.println("Protocol : "+request.getProtocol()+"<br/>");
	out.println("URL : "+request.getRequestURL()+"<br/>");
	out.println("URI : "+request.getRequestURI()+"<br/>");

%>





</body>
</html>