<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<b><h1>상품 선택 저장 결과</h1></b><br/>

<% 
   String str = request.getParameter("result");
   if(str.equals("success")){
      out.println("저장 되었습니다");
   }else{
      out.println("파일에 데이터를 쓸수 없습니다.");
   }
%>

<br/>
<form action = "A6_4Test.jsp" method = post>
<input type = submit value = 저장결과불러오기>
</form>

</body>
</html>