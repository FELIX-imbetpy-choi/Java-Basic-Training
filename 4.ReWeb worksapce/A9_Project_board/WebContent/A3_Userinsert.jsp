<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 권장</title>
</head>
<body>

	<h1> 등록되지 않은 사용자 입니다. 회원가입을 진행해주세요 </h1>
	
	
	<p>중복검사 할 아이디를 입력하세요</p>
	<table>
	<form action = A4_Userinsert.jsp method = get>
		
		<table border="0">
		
		  <tr>
            <td align ="right">ID:</td>  
            <td><input type = text  name= userid size = 20 ></td> 
         </tr>
         <tr>
         
          <tr>
            <td></td>
            <td><input type = submit value = '확인'></td>
          </tr>
	
	</form>
	</table>
	

</body>
</html>