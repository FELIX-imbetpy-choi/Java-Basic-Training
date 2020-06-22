<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>입력결과</title>
</head>
<body background = "http://file3.instiz.net/data/file3/2018/02/04/2/f/a/2faefcc60d4583ba5ab4eee5aa0636ca.jpg"
 style = "background-repeat : no-repeat; background-size: 1300px;"
 >
	
<%
	request.setCharacterEncoding("utf-8");
%>

	<table border="0">
	<h1 style = " color : lightskyblue ">입력결과</h1>
	<tr>
	<th bgcolor = "Mediumorchid">타이틀</th>
	<th bgcolor = "Mediumorchid">내용</th><br/>
	</tr>
	
	<tr>
	<td align = "right" " bgcolor = "lightpink">사용자ID  : </td>
	<td bgcolor = "lightpink"><%=(String)session.getAttribute("ID") %></td><br/>
	</tr>
	
	<tr>
	<td align = "right" " bgcolor = "lightpink">성명		: </td>
	<td bgcolor = "lightpink"><%=(String)session.getAttribute("NAME") %></td><br/>
	</tr>
	
	<tr>
	<td align = "right" bgcolor = "lightpink">전화번호 	: </td>
	<td bgcolor = "lightpink"><%=(String)session.getAttribute("TEL") %></td><br/>
	</tr>
	
	<tr>
	<td align = "right" bgcolor = "lightpink">주소		: </td>
	<td bgcolor = "lightpink"><%=(String)session.getAttribute("ADDRESS") %></td><br/>
	</tr>
	 </table>


<% session.invalidate(); %>

</body>
</html>