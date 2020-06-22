<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 저장 결과</title>
</head>
<body>

<%

	//이렇게 파일이 두개인 경우에 마지막 파일을 반복해서 새로고침 하면 계속 저장이 된다. write 파일과 마지막엔 메세지만 뜨는 파일로 분리 시켜주어야 한다.
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	//저장할 파일을 만든다
	String fileName = name + ".txt" ;
	
	//쓰기하는 방법
	//C:\Temp\BigData class src\4.Suvlet workspace\.metadata\.plugins\org.eclipse.wst.server.core
	// \tmp0\wtpwebapps\A5_Application 에 저장되어 있음
	
	PrintWriter writer = null;
	try{
		String filePath = application.getRealPath(fileName);
		writer = new PrintWriter(filePath);
		writer.println("제목 : " + title);
		writer.println("이름 : " + name);
		writer.println(content);
		
		out.println(filePath+"에");
		out.println("저장 되었습니다. " );
	}catch(IOException ioe){
		out.println("파일에 데이터를 쓸 수 없습니다.");
	}finally{
		try{
			writer.close();
		}
		catch(Exception e){
			out.println("error");
		}
	}
	


%>

</body>
</html>