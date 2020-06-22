<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<!-- 20181018 포워드 방식으로 했더니 값이 넘어가면서 사라진다. 값을 컴퓨터에 저장해야하나 보다. Appwirte 로 다시 시도 해보기 -->
<!-- App Write로 해보기 -->
	
	<form action = "A5_2Test.jsp" method = "get">
	
	
	수량 : <input type = "text" name = "name"><br/>
	 
	크기 : <input type = "radio" name = "size" value = "대">대
		 <input type = "radio" name = "size" value = "중">중
		 <input type = "radio" name = "size" value = "소">소<br/>
 
	색상 : <input type = "checkbox" name = "color" value = "베이지">베이지
		 <input type = "checkbox" name = "color" value = "브라운">브라운
		 <input type = "checkbox" name = "color" value = "카키">카키<br/>
	
	<input type = submit value = 저장>
	
	</form>

</body>
</html>