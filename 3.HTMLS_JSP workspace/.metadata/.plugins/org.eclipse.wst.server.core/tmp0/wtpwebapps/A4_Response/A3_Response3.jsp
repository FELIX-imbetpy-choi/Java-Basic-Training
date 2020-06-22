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
	 String name;
	 name = request.getParameter("uage1");
	 int uage = Integer.parseInt(name);

%>

<% 
if(uage > 19){
	out.println("웰컴투 어덜트 월드"+uage+"세 늙은이");
}
if(uage <= 19){
	out.println("아직 때가 되지 않았다 돌아가"+uage+"세");
}

	
%>

</body>
</html>