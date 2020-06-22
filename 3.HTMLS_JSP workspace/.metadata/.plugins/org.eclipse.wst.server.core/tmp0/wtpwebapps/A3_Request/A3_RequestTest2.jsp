<%@page import="java.util.Arrays"%>
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

   String name, id, pw, protocol, majors;
   String[] hobbies;
   
   name = request.getParameter("strname");
   id = request.getParameter("strId");
   pw = request.getParameter("strpass");
   protocol = request.getParameter("proto");
   
   majors = request.getParameter("major");
   hobbies = request.getParameterValues("hob");
%>

	이름 : <%=name %><br/>
	아이디 : <%=id %><br/>
	패스워드 : <%=pw %><br/>
	취미 : <%=Arrays.toString(hobbies) %><br/>
	전공 : <%=majors %><br/>
	프로토콜 : <%=protocol %><br/>

</body>
</html>