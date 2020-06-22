
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

<!--!!!!! @page import="java.sql.*"@ 에서 *를 쓰면 아래 임포트가 모두 들어간다- java.sql의 모든 소스를 다 쓴다는 뜻. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");

	String userid = request.getParameter("userid");
	String username = request.getParameter("username");
	String usertel = request.getParameter("usertel");
	String useraddress = request.getParameter("useraddress");
	
	session.setAttribute("ID", userid);
	session.setAttribute("NAME", username);
	session.setAttribute("TEL", usertel);
	session.setAttribute("ADDRESS", useraddress);

%>
    
    
<%
	// 1 사용자 입력값 받아오기
	String Tuserid = request.getParameter("userid");

	String url_mysql = "jdbc:mysql://127.0.0.1/customer";  //여기의 ip는 내컴퓨터의 아이피 - lacalhost로 써도 된다.
	String id_mysql = "root";
	String pw_mysql = "1111";
	
	PreparedStatement ps = null;
	try{
		// import문에서 정보 보기
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		String A = "insert into purchaserinfo(userid,name,tel,address,insertdate)  ";
		String B = "values(?,?,?,?,now())";
		
		// 1 사용자 입력값 데이터 베이스에 입력
		ps = conn_mysql.prepareStatement(A+B);
		ps.setString(1, (String)session.getAttribute("ID"));
		ps.setString(2, (String)session.getAttribute("NAME"));
		ps.setString(3, (String)session.getAttribute("TEL"));
		ps.setString(4, (String)session.getAttribute("ADDRESS"));
		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("insertTest_03.jsp");
	

%>


