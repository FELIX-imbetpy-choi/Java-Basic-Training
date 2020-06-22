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
	request.setCharacterEncoding("utf-8");
	//세션은 인코딩 디코딩 따로 쓸 필요 없다 최근에 나온거라
	
	String food_T = request.getParameter("food");
	session.setAttribute("FOOD", food_T);

%>

	<h2>좋아하는 동물은?? </h2>
	
	<form>
	<form action = "A1_3SessionMain.jsp">
	<input type = text name = mons>
	
	<input type = submit value = 확인>
	
	</form>	

</body>
</html>