<%@page import="java.io.IOException"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
   BufferedReader reader = null;
   try{
      String filePath = application.getRealPath("test.txt");
      reader = new BufferedReader(new FileReader(filePath));
      while(true){
         String str = reader.readLine();
         if(str == null) break;
         out.println(str + "<br />"); 
      }   //파일 읽어오는 로직 (변하지 않음) 복붙해서 쓰도록!
   }catch(FileNotFoundException fnfe){
      out.println("파일이 존재하지 않습니다.");
   }catch(IOException ioe){
      out.println("파일을 읽을수가 없습니다.");
   }finally{
      try{
         reader.close();
      }catch(Exception e){
         out.println("진짜 에러");
      }
   }
%>

</body>
</html>