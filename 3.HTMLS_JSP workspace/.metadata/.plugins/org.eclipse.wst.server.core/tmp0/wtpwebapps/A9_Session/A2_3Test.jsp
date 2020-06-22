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
		String Chk = request.getParameter("userMar");
		int kk = Integer.parseInt(Chk);
		
		
		if(kk == 1){
			response.sendRedirect("A2_4Test.jsp");
		}
		if(kk == 2){
			response.sendRedirect("A2_1Test.jsp");
		}
	%>
	
</body>
</html>