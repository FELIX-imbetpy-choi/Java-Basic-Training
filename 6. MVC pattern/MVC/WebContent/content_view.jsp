<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="0">
		<form action = "update.do" method="post">
			<input type="hidden" name="bId" value="${content_view.bId }"> 
			
			<tr>
				<td>이름</td>
				<td><input type=text name=bName value="${content_view.bName }"></td>
			</tr>
			
			<tr>
				<td>제목</td>
				<td><input type=text name=bTitle value="${content_view.bTitle }"></td>
			</tr>
			
			<tr>
				<td>내용</td>
				<td><textarea rows=40 cols=38 name=bContent >"${content_view.bContent }"</textarea></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type=submit value=수정>&nbsp;&nbsp;&nbsp;<a href="list.do">목록보기</a><a href="delete.do?bId=${content_view.bId}">삭제하기</a></td></td>
			</tr>
		
		</form>
	</table>

</body>
</html>