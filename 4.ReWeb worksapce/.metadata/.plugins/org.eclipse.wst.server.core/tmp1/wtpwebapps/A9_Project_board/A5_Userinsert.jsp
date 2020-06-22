
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

<!--!!!!! @page import="java.sql.*"@ 에서 *를 쓰면 아래 임포트가 모두 들어간다- java.sql의 모든 소스를 다 쓴다는 뜻. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");

	String Tuserid = request.getParameter("userid");
	String Tuserpassword = request.getParameter("userpassword");
	String Tusername = request.getParameter("username");
	String Tusertelno = request.getParameter("usertelno");
	String Tuseraddress = request.getParameter("useraddress");
	String Tuseremail = request.getParameter("useremail");
	
	session.setAttribute("USERID", Tuserid);
	session.setAttribute("USERPASSWORD", Tuserpassword);
	session.setAttribute("USERNAME", Tusername);
	session.setAttribute("USERTELNO", Tusertelno);
	session.setAttribute("USERADDRESS", Tuseraddress);
	session.setAttribute("USEREMAIL", Tuseraddress);

%>
    
    
<%
	// 1 사용자 입력값 받아오기

	String url_mysql = "jdbc:mysql://192.168.101.142/noticeboard";  //여기의 ip는 내컴퓨터의 아이피 - lacalhost로 써도 된다.
	String id_mysql = "root";
	String pw_mysql = "1111";
	
	PreparedStatement ps = null;
	try{
		// import문에서 정보 보기
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		String A = "insert into user(userid,userpassword,name,telno,email,address)  ";
		String B = "values(?,?,?,?,?,?)";
		
		// 1 사용자 입력값 데이터 베이스에 입력
		ps = conn_mysql.prepareStatement(A+B);
		
		ps.setString(1, (String)session.getAttribute("USERID"));
		ps.setString(2, (String)session.getAttribute("USERPASSWORD"));
		ps.setString(3, (String)session.getAttribute("USERNAME"));
		ps.setString(4, (String)session.getAttribute("USERTELNO"));
		ps.setString(5, (String)session.getAttribute("USEREMAIL"));
		ps.setString(6, (String)session.getAttribute("USERADDRESS"));
		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("A6_Userinsert.jsp");
	

%>


