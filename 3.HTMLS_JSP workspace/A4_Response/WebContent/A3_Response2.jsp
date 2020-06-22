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
	String uage = null;

	uage = request.getParameter("age");
	int uage1 = Integer.parseInt(uage);
	
		if(uage != null){
			response.sendRedirect("http://172.30.85.72:8088/A4_Response/A3_Response3.jsp?age=" + uage1); 
		}
		
		if(uage == null){
			//값이 입력되지 않았을 때는 처음으로 돌아가도록 함
			response.sendRedirect("http://172.30.85.72:8088/A4_Response/A3_Response1_Userage.jsp?age=" + uage1);
		}
%>

</body>
</html>