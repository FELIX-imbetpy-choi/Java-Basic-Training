<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>구매자 정보 입력</title>
</head>
<body>

	<h1>아래의 항목을 입력후 확인 버튼을눌러주세요!</h1>
	
	
	<table>
	<form action = insertTest_02.jsp method = get>
		
		<table border="0">
		
		<tr>
		<td align = "right" >사용자 ID : </td>
		<td><input type = text name = userid size = 10><br/></td>
		</tr>
		
		<tr>
		<td align = "right" >성명 : </td>
		<td><input type = text name = username size = 10><br/></td>
		</tr>
		
		<tr>
		<td align = "right" >전화번호 : </td>
		<td><input type = text name = usertel size = 20><br/></td>
		</tr>
		
		<tr>
		<td align = "right" >주소 : </td>
		<td><input type = text name = useraddress size = 30><br/></td>
		</tr>
		</table>
		
		<tr>
		<td align = "right">
		<input type = submit value = '확인'>
		</td>
		</tr>
	
	</form>
	</table>
	

</body>
</html>