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

	String url_mysql = "jdbc:mysql://127.0.0.1/eclipse";  //여기의 ip는 내컴퓨터의 아이피 - lacalhost로 써도 된다.
	String id_mysql = "root";
	String pw_mysql = "1111";
	
	String WhereDefault = "select id, userid from wtest";
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
			<th> <!--  td와 같은데 글씨가 조금 더 굴다 --> 번</th><th>User ID</th>
		</tr>

<% 		
		while(rs.next()){
%>
		<tr>
			<td><%=rs.getInt(1) %></td><<td><%=rs.getString(2) %></td>
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