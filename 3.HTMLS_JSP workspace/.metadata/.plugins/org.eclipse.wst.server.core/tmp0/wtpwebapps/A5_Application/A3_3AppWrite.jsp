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
	String str = request.getParameter("result");
	if(str.equals("sucess")){
		out.println("저장되었습니다.");
	}
	else{
		out.println("파일에 데이터 쓸 수 없음");
	}
	
%>
</body>
</html>