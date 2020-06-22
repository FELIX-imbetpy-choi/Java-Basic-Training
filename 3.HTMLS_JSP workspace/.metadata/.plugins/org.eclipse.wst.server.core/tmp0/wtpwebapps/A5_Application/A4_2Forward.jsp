<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!--  redirect 방식과 dispacher 방식의 차이점 -->
<!-- http://devbox.tistory.com/entry/Comporison-Dispatcher%EB%B0%A9%EC%8B%9D%EA%B3%BC-Redirect-%EB%B0%A9%EC%8B%9D -->
</head>
<body>

<%
   String str1 = request.getParameter("num1");
   String str2 = request.getParameter("num2");
   
   int num1 = Integer.parseInt(str1);
   int num2 = Integer.parseInt(str2);

   request.setAttribute("ADD", num1 + num2); //변수를 만들어 저장한 값을 넘겨 주겠다
   request.setAttribute("SUB", num1 - num2); //변수를 만들어 저장한 값을 넘겨 주겠다
   request.setAttribute("MUL", num1 * num2); //변수를 만들어 저장한 값을 넘겨 주겠다
   request.setAttribute("DIV", num1 / num2); //변수를 만들어 저장한 값을 넘겨 주겠다
   
   //sendReirect 를 하게 되면 null 값으로 나온다? 값이 정해져 있지 않기 때문 - 파일값에 변수값을 담아줘야만 쓸 수 있다.
   
   RequestDispatcher dispatcher = request.getRequestDispatcher("forward_03.jsp");
   
   dispatcher.forward(request, response);
   
%>

</body>
</html>