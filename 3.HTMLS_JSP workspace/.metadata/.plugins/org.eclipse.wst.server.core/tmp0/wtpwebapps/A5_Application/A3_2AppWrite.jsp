<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
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

	// A2_AppWrite 처럼 파일이 두개인 경우에 마지막 파일을 반복해서 새로고침 하면 계속 저장이 된다. 
	// write 파일과 마지막엔 메세지만 뜨는 파일로 분리 시켜주어야 한다.
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String result;
	
	//저장할 파일을 만든다
	String fileName = name + ".txt" ;
	
	//쓰기하는 방법
	
	PrintWriter writer = null;
	try{
		String filePath = application.getRealPath(fileName);
		writer = new PrintWriter(filePath);
		writer.println("제목 : " + title);
		writer.println("이름 : " + name);
		writer.println(content);
		
		result = "sucess";
		
	}catch(IOException ioe){
		result = "fail";
	}finally{
		try{
			writer.close();
		}
		catch(Exception e){
			result = "fail";
		}
	}
	
	//사용자는 마지막 페이지에 실행 여부만을 볼 수 있게 성공과 실패시에 변수를 보내주는 변수를 작성하여 다음 파일로 넘겨준다.보내주기 다음에서 요청하기
	response.sendRedirect("A3_3AppWrite.jsp?result="+result);
	
%>

</body>
</html>