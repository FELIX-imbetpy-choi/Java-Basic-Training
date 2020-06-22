<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 2 로그인 판정</title>
</head>
<body>

<!--  jsp먼저 다 만들어 놓고 , html 구분을 해 주는 것이 좋다. -->


	<h3>User ID List</h3>
	
	<%
		String USERID = (String)request.getParameter("userid");
		String USERPASS = (String)request.getParameter("userpassword");
		
	%>
	
	
	    
<%
	// 1 사용자 입력값 받아오기

	String url_mysql = "jdbc:mysql://192.168.101.142/noticeboard";  //여기의 ip는 내컴퓨터의 아이피 - lacalhost로 써도 된다.
	String id_mysql = "root";
	String pw_mysql = "1111";
	
	String WhereDefault = "select userid, userpassword, name, telno, email, address from user";
	String Userinfo = " Where userid ='" + USERID.toLowerCase().trim()+"' and userpassword = '"+USERPASS.toLowerCase().trim()+"'";
	int cnt = 0;
	
	PreparedStatement ps = null;
	try{
		// import문에서 정보 보기
		Class.forName( "com.mysql.jdbc.Driver" );
		Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		
		ResultSet rs = stmt_mysql.executeQuery(WhereDefault+Userinfo);
		
		
		while(rs.next()){
			cnt++;
		}
		
		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	//사용자 정보가 없을 경우 게시판으로 넘어가기
	if(cnt==0){
		response.sendRedirect("A3_Userinsert.jsp");
	}
	//사용자 정보가 존재하면 게시판으로
	if(cnt > 0){
		
	}
	
	

%>
<!--  사용자 없을시 0 있을시 1 -->
<%=cnt %>
