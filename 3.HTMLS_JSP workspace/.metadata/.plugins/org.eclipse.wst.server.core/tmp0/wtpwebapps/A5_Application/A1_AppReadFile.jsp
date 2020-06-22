<%@page import="java.io.IOException"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 읽어 오기</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>


<%
	//Buffered는 모든 내용을 다 읽어 드리는 것
  	BufferedReader reader = null;

	//자바에서 파일 쓸때는 == 를 써야하나 if 문에서 equals 안먹힌다.

   	try{	
   			String filePath = application.getRealPath("text.txt");
      		reader = new BufferedReader(new FileReader(filePath));
      		
    	  	 while(true){
        	 String str = reader.readLine();
        	 if(str == null) break;
        	 out.println(str + "<br />"); 
      		} 
   	}
   //파일 읽어오는 로직 (변하지 않음)
   // Filenotfound는 파일을 찾을수 없을때
   catch(FileNotFoundException fnfe)
   	{
      out.println("파일이 존재하지 않습니다.");
 	  }
	// 입력출력에서 권한이 없을때 
   catch(IOException ioe){
      out.println("파일을 읽을수가 없습니다.");
  	 }
   finally{
      try{
         reader.close();
      }
      catch(Exception e){
         out.println("진짜 에러");
      }
   }
%>

</body>
</html>