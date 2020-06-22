<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객님의 상품 저장</title>
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

<!-- Form action에서 survlet을 불러올때는 뒤에 파일 형식을 붙이지 않아도 된다. -->

<br/>
<form action = "A5_4SurvletTest" method = get>
<input type = submit value = 저장결과불러오기>
</form>

</body>
</html>