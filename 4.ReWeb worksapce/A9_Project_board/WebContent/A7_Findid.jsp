<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4 사용자 ID찾기</title>
</head>
<body>

	
	<table>
	<form action = "A8_Findid.jsp" method = get>
		
		<table border="0">
		
		
		<tr>
		<td align = "right" >성명 : </td>
		<td><input type = text name = username size = 10 ><br/></td>
		</tr>
		
		<tr>
		<td align = "right" >전화번호 : </td>
		<td><input type = text name = usertel  size = 20 ><br/></td>
		</tr>
		
		
		<tr>
		<td align = "right">
		<input type = submit value = '확인'>
		</td>
		</tr>
	
	</form>
	</table>
	
	

</body>
</html>