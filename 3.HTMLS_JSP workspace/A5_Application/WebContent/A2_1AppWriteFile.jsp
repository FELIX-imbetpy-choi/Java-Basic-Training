<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WriteFile_01</title>
</head>
<body>
	<h>Write file</h>
	
	<form action = "A2_2AppWriteFile.jsp" method = post>
		이름 : <input type = text name = name><br/>
		제목 : <input type = text name = title><br/>
		<textarea cols = 30 rows = 5 name = content></textarea>
		</textarea><br/>
		
		<input type = submit value = "확인">
	
	
	</form>

</body>
</html>