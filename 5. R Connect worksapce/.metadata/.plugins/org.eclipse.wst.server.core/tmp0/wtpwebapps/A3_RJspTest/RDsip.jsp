<%@page import="org.apache.tomcat.util.codec.binary.Base64"%>
<%@page import="org.rosuda.REngine.Rserve.RserveException"%>
<%@page import="org.rosuda.REngine.Rserve.RConnection"%>
<%@page import="com.rlec.test.RJsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP with R</title>
</head>
<body>
<h1>R과 JSP연결</h1>

<%RJsp rj = new RJsp(); %>
	<h3>sum</h3>
<% out.println(rj.getSum());%>
	<h3>Mean</h3>
<% out.println(rj.getMean());%>
	<h3>head(iris)</h3>
<% 
	int cols = rj.getIrisCols();
	int rows = rj.getIrisRows();
	String[] rHead = rj.getIrisHeader();
	String[][] s = rj.getIris();
%>

	<table border = "1">
	<tr>
	<% 
	for (int i = 0; i < cols; i++){
	%>
		<td><%out.print(rHead[i]); %></td>
	<%
	}
	%>
	
	<% 
	for (int i = 0; i < rows; i++){
	%>
		<tr>
		<%
		for (int j = 0; j < cols; j++){ 
		%>
			<td><% out.print(s[j][i]); %></td>
		<%
		}
		%>
	<%
	}
	%>
</table>

<hr>
		<h3>plot(iris$Sepal.Length)</h3>
	<%
		String dataimage = Base64.encodeBase64String(rj.getPlot()); // org.apatch.util.codec.binary 를 써야함
	%>
		<img src = "data:image/png;base64,<%=dataimage %>">
<hr>
</body>
</html>