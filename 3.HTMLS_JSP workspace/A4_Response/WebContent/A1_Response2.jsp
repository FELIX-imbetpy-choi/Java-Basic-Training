<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<!--  toLowerCase - 사용 하면 입력값이 모두 소문자로 변한다.  -->


<%
		//request.getParameter 로 전의 변수를 요청해 가지고 온다.
		// 하지만 이 방식은  한단계 건너 뛰면 변수들이 날아간다.
		// toLowerCase사용 하면 입력값이 모두 소문자로 변한다.
   		String siteTemp = request.getParameter("sitename").toLowerCase();
	
		
		// 특정 조건일때 지정한 페이지로 이동하기를 원할 때 사용한다.
		switch(siteTemp){
		case "naver" :
				response.sendRedirect("http://www.naver.com");
			break;
		case "daum" :
				response.sendRedirect("http://www.daum.net");
			break;
		case "google" :
				response.sendRedirect("http://www.google.com"); 
			break;
	}
      
%>





</body>
</html>