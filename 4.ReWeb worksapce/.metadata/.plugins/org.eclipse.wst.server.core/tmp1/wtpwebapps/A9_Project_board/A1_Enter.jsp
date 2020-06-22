<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Welcome to 불사조 게시판</title>
</head>
<body>

<h1> 이곳은 불사조 게시판 
</h1>

<table>
	<form action = A2_Userjudg.jsp method = get>
		
		<table border="0">
		
		<tr>
		<td align = "right" > 사용자 ID : </td>
		<td><input type = text name = userid size = 25><br/></td>
		</tr>
		
		
		<tr>
		<td align = "right" > 비밀번호 : </td>
		<td><input type = password name = userpassword size = 25><br/></td>
		</tr>
		</table>
		
		<tr>
		<!--  이동 !! -->
		<td><a href = "A3_Userinsert.jsp">회원가입</a></td>
		<td><a href = "A7_Findid.jsp">ID찾기</a></td>
		<td><a href = "A91_Findpw.jsp">PW찾기</a></td>
		<br/>

		<td align = "right">
		<input type = submit value = '확인'>
		</td>
		
		</tr>
</form>
</table>

</body>
</html>