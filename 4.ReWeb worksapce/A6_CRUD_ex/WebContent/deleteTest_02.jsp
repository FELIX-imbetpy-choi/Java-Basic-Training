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
<title>데이터베이스에서 불러오기</title>
</head>
<body>

<!--  jsp먼저 다 만들어 놓고 , html 구분을 해 주는 것이 좋다. -->


	<h3>삭제란 계란아님</h3>
	
	
<%
	request.setCharacterEncoding("utf-8");

	String userid = request.getParameter("userid");
	session.setAttribute("ID", userid);
	
	String ID = "";
	String NAME = "";
	String TEL = "";
	String ADDRESS = "";

%>
	    
<%
	// 1 사용자 입력값 받아오기

	String url_mysql = "jdbc:mysql://127.0.0.1/customer";  //여기의 ip는 내컴퓨터의 아이피 - lacalhost로 써도 된다.
	String id_mysql = "root";
	String pw_mysql = "1111";
	
	String WhereDefault = "select userid, name, tel, address  from purchaserinfo where userid = '"+(String)session.getAttribute("ID")+"'";
	int cnt = 0;
	
	PreparedStatement ps = null;
	try{
		// import문에서 정보 보기
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		
		ResultSet rs = stmt_mysql.executeQuery(WhereDefault);
		

	
		while(rs.next()){

			ID = rs.getString(1);
			NAME = rs.getString(2); 
			TEL = rs.getString(3); 
			ADDRESS = rs.getString(4); 

			cnt++;
		}

		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e){
		e.printStackTrace();
		
	}
	if(cnt == 0){
	response.sendRedirect("deleteTest_01.jsp");
	}
	
	
%>
	
	<table>
	<form action = deleteTest_03.jsp method = get>
		
		<table border="0">
		
		<tr>
		<td align = "right" >사용자 ID : </td>
		<td><input type = text name = userid value = <%= ID %> size = 10 readonly = readonly><br/></td>
		</tr>
		
		<tr>
		<td align = "right" >성명 : </td>
		<td><input type = text name = username value = <%=NAME %> size = 10 readonly = readonly><br/></td>
		</tr>
		
		<tr>
		<td align = "right" >전화번호 : </td>
		<td><input type = text name = usertel value = <%=TEL %> size = 20 readonly = readonly><br/></td>
		</tr>
		
		<tr>
		<td align = "right" >주소 : </td>
		<td><input type = text name = useraddress value = <%=ADDRESS %> size = 30 readonly = readonly><br/></td>
		</tr>
		</table>
		
		<tr>
		<td align = "right">
		<input type = submit value = '삭제'>
		</td>
		</tr>
	
	</form>
	</table>
	
	

</body>
</html>