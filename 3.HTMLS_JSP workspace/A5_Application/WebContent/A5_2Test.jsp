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

	String str1 = request.getParameter("name"); //수량
	String str2 = request.getParameter("size"); //사이즈
	String str3 = request.getParameter("color"); //색상
	
	request.setAttribute("ANT",str1);
	request.setAttribute("SIZ",str2);
	request.setAttribute("COL",str3);
	
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("A5_3Test.jsp");
	  
	dispatcher.forward(request,response);
	
%>	



</body>
</html>