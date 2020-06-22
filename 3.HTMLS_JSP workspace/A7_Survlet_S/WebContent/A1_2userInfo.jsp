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
   String str1 = request.getParameter("uerName");//이름
   String str2 = request.getParameter("userId");//제목
   String str3 = request.getParameter("Itro");//제목
   

   request.setAttribute("name", str1); //변수를 만들어 저장한 값을 넘겨 주겠다
   request.setAttribute("sub", str2); //변수를 만들어 저장한 값을 넘겨 주겠다
   request.setAttribute("intro", str3); //변수를 만들어 저장한 값을 넘겨 주겠다
   
   //sendReirect 를 하게 되면 null 값으로 나온다? 값이 정해져 있지 않기 때문 - 파일값에 변수값을 담아줘야만 쓸 수 있다.
   
   RequestDispatcher dispatcher = request.getRequestDispatcher("A1_3userInfo");
   
   dispatcher.forward(request, response);
   
%>

</body>
</html>