<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 나이 판단</title>
</head>
<body>

<%
// 변수 작성에 있어서 get 방식에서 드러나는 특징을 이용해서 변수를 넘겨준다. 변수명을 ? 뒤에 작성하고 받은 변수를 값으로 넣어 넘겨준다.
	String uage = request.getParameter("age");
	int uage1 = Integer.parseInt(uage);

	if(uage1 > 19){
		response.sendRedirect("http://192.168.35.35:8080/A4_Response/A2_Response3.jsp?age="+uage1); 
	}
	if(uage1 <=19){
		response.sendRedirect("http://192.168.35.35:8080/A4_Response/A2_Response4.jsp?age="+uage1);  
	}

%>

</body>
</html>