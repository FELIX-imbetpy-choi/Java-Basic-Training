

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
</html>
<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	GregorianCalendar now = new GregorianCalendar();
%>
현재일은 
<!-- 대소문자를 잘 구분 해서 써야한다. -->
<%= String.format("%TY 년%Tm 월 %Td 일 ",now,now,now)%>
입니다<br/>
현재시각은
<%= String.format("%TH  시 %TM   분 %TS   초",now,now,now)%>
입니다.<br/>


<%
	SimpleDateFormat fm = new SimpleDateFormat("yyyy년MM월dd일HH시mm분ss초");
	String date = fm.format(new Date());
	out.println("현재시간은 다시한번 : " + date);
	
%>
