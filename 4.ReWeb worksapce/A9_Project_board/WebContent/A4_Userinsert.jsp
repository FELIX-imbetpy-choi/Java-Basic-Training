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
<title>아이디 중복 검사</title>
</head>
<body>

	<h1> 나머지 정보를 입력해주세요.</h1>
	
	<!-- 아이디 중복 검사 -->
	<%
		String USERID = (String)request.getParameter("userid");
		
	%>
	
	
	    
<%
	// 1 사용자 입력값 받아오기

	String url_mysql = "jdbc:mysql://192.168.101.142/noticeboard";  //여기의 ip는 내컴퓨터의 아이피 - lacalhost로 써도 된다.
	String id_mysql = "root";
	String pw_mysql = "1111";
	
	String WhereDefault = "select userid, userpassword, name, telno, email, address from user";
	String Userinfo = " Where userid ='" + USERID+ "'";
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
	
	//사용자 정보가 없을 경우 가입창으로
	if(cnt==0){
		
	}
	//사용자 정보가 존재하면 다시 중복체크 창으로
	if(cnt > 0){
		response.sendRedirect("A3_Userinsert.jsp");
	}
	
	

%>
	
	
	<table>
	<form action = A5_Userinsert.jsp method = get>
		
		<table border="0">
		
		  <tr>
            <td align ="right">ID:</td>  
            <td><input type = text  name= userid size = 20 value= <%=USERID %> readonly = readolny></td> 
         </tr>
         <tr>
            <td align ="right">Password:</td>  
            <td><input type = "password" name = userpassword size = 20 > </td>
         </tr>
         <tr>
            <td align ="right">이름:</td>  
            <td><input type = text  name = username size = 20 > </td>
         </tr>
         <tr>
            <td align ="right">전화번호:</td>  
            <td><input type = text name = usertelno size = 30 > </td>
         </tr>
         <tr>
            <td align ="right">주소:</td>  
            <td><input type = text name = useraddress size = 50 > </td>
         </tr>
         <tr>
            <td align ="right">E-mail:</td>  
            <td><input type = text name = useremail size = 30 > </td>
         </tr>
          <tr>
            <td></td>
            <td><input type = submit value = '확인'></td>
          </tr>
	
	</form>
	</table>
	

</body>
</html>