<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Database 수정을 위한 테스트</title>
</head>
<body>
	<h1>Database 입력</h1>
	
	<form action = updateTest_02.jsp method = get>
		구 사용자 ID : <input type = text name = old_userid size = 10>
		신 사용자 ID : <input type = text name = new_userid size = 10>
		<input type = submit value = 'OK'>
	
	</form>

</body>
</html>