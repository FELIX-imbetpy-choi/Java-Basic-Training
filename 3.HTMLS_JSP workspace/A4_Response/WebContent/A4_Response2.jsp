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
//값의 길이를 가지고 입력값이 있나 없나를 판가름 함

	String siteTemp = request.getParameter("siteAge");
	if(siteTemp.length()==0){
		out.println("<h1>나이를 입력해주세요.<h1><br/>");
		//response.sendRedirect("http://localhost:8080/Response/Response03.jsp?age="+siteTemp);
	}else{
		int age = Integer.parseInt(siteTemp);
		if(age>19){
			out.println("<h1>성인<h1><br/>");
			out.println("당신의 나이는 " + age + "세 이므로 주류 구매가 가능합니다.<br/>");
			//response.sendRedirect("http://localhost:8080/Response/Response03.jsp?age="+siteTemp);
		}else{
			out.println("<h1>미성년자<h1><br/>");
			out.println("당신의 나이는 " + age + "세 이므로 주류 구매가 불가능합니다.<br/>");
			//response.sendRedirect("http://localhost:8080/Response/Response03.jsp?age="+siteTemp);
		}
	}
%>	

	<a href = "http://localhost:8088/A_4Response/A4_Response1_Userage.jsp">처음으로이동</a>
</body>
</html>