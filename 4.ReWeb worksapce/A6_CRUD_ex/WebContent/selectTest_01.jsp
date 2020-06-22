<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>


<!-- 음음음 위으 import문을 줄여서 쓰는것 뭐지? -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스에서 불러오기</title>
</head>
<body>

<!--  jsp먼저 다 만들어 놓고 , html 구분을 해 주는 것이 좋다. -->


	<h3>User ID List</h3>
	
	    
<%
	// 1 사용자 입력값 받아오기

	String url_mysql = "jdbc:mysql://127.0.0.1/customer";  //여기의 ip는 내컴퓨터의 아이피 - lacalhost로 써도 된다.
	String id_mysql = "root";
	String pw_mysql = "1111";
	
	String WhereDefault = "select userid, name, tel, address, insertdate from purchaserinfo";
	int cnt = 0;
	
	PreparedStatement ps = null;
	try{
		// import문에서 정보 보기
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		
		ResultSet rs = stmt_mysql.executeQuery(WhereDefault);
		
%>
	<table border = 1>
		<tr>
			<th>User ID</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>가입일</th>
		</tr>

<% 		
		while(rs.next()){
%>
		<tr>
		<!--  주소에서 변수를 넘겨줄 때 띄어쓰기를 하면 %20의 띄어쓰기 값이 삽입된다. -->
			<td><a href = "http://127.0.0.1:8080/A6_CRUD_ex/selectTest_02.jsp?userid=<%=rs.getString(1) %>"><%=rs.getString(1) %></a></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><%=rs.getString(5) %></td>
		</tr>

<% 
			cnt++;
		}
%>

	</table>

<%	
		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	

%>
	<br/>
	총인원은 <%= cnt  %> 입니다.

</body>
</html>