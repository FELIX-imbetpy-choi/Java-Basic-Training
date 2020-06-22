<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4 이름과 전화번호로 비밀번호 찾기</title>
</head>
<body>

<%
	String USERID = request.getParameter("userid");
	String USERTEL = request.getParameter("usertel");
	
	String PW = "";

%>
	    
<%
	// 1 사용자 입력값 받아오기

	String url_mysql = "jdbc:mysql://192.168.101.142/noticeboard";  //여기의 ip는 내컴퓨터의 아이피 - lacalhost로 써도 된다.
	String id_mysql = "root";
	String pw_mysql = "1111";
	
	
	String WhereDefault = "select userpassword from user ";
	String Userinfo = " Where userid ='" + USERID+"' and telno = '"+USERTEL+"'";
	int cnt = 0;
	
	PreparedStatement ps = null;
	try{
		// import문에서 정보 보기
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		
		ResultSet rs = stmt_mysql.executeQuery(WhereDefault+Userinfo);
		

	
		while(rs.next()){

			PW = rs.getString(1);

			cnt++;
		}

		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e){
		e.printStackTrace();
		
	}
	
	
	response.sendRedirect("A93_Findpw.jsp?userpassword="+PW);
	
	
%>

<%=PW %>

</body>
</html>