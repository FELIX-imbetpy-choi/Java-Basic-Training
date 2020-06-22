<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application 내장변수</title>
<!-- 20181021 복습완료 ★ -->
<!-- 참고자료 http://finewoo.tistory.com/18 -->

</head>
<body>

<!-- jsp 에서 텍스트 문서를 사용하려면 저장시에 utf-8을 지정해주어야 깨지지 않는다. -->

<%
	 // getContextPath 는 프로젝트의 contextpath 값을 반환한다. - 현재는 A5_Application 이 프로젝트 파일명이므로 이것이 출력된다.
	 // request.getRequestURI 는 프로젝트와 파일명이 출력된다.
	 String appPath = application.getContextPath();
	// request.getRealPath("") 파일의 위치 경로를 완전히 다 출력해 준다.
	 String filePath = application.getRealPath("text.txt");

%>

<%=appPath %><br/>
<%=filePath %>

</body>
</html>