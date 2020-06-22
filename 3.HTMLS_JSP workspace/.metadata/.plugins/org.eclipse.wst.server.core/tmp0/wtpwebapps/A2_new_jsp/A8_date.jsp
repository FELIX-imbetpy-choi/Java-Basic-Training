<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜와 시간</title>
<!-- 20181021 복습완료 ★ -->
<!-- 날짜에 대한 다른 사용법 보충학습 -->
<!-- 흠 자바 함수를 이용할 수록 너무 복잡해지네!! 조금만 알고 넘어가기 -->
<!--  참고자료 http://mainia.tistory.com/2119 -->

</head>
<body>

<% 
	GregorianCalendar now = new GregorianCalendar();
	String date = String.format("%TF", now);
	// TF : yyy-mm-dd로 나타내주는 것
	String time = String.format("%TT", now);
	// TT : hh : mm : ss 를 나타냄
%>

	오늘의 날짜 : <%= date %><br/>
	현재시각 : <%= time %><br/>
	
<!-- 대소문자를 잘 구분 해서 써야한다. -->
<%= String.format("%TY 년%Tm 월 %Td 일 ",now,now,now)%><br/>
<%= String.format("%TH  시 %TM   분 %TS   초",now,now,now)%><br/>

<!-- + 심화학습----------------------------------------------- -->
<p>-----심화학습 다른 방식으로 java에서 시간 불러오기-----</p>

<%
//현재 날짜 구하기 Calendar 으로
	int nYear;
	int nMonth;
	int nDay;
	//현재 날짜 구하기 - 캘린더 import - GregorianCalendar import
	Calendar calendar = new GregorianCalendar(Locale.KOREA);
	nYear = calendar.get(Calendar.YEAR);
	nMonth = calendar.get(Calendar.MONTH)+1;//달수는 0부터 계산되서 꼭 +1을 해주어야 한다.
	nDay = calendar.get(Calendar.DATE);
	out.println("오늘의 날짜 = " + nYear + "-"+nMonth+"-"+nDay);
%>
	<br/>
<%
// 그레고리안 이용해 년도, 월, 일 더하기 - 마이너스 입력시 시간을 빼준다
	Calendar cal = new GregorianCalendar(Locale.KOREA);
	cal.setTime(new Date());
	cal.add(Calendar.YEAR, 1);//1년을 더해준다
	cal.add(Calendar.MONTH, 1);//1달을 더해준다
	cal.add(Calendar.DAY_OF_YEAR, 1);//1일을 더해준다
	cal.add(Calendar.HOUR, 1);// 1시간을 더해준다
	
	SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH시mm분ss초");
	String strDate = fm.format(cal.getTime());
	out.println(strDate);

%>
	<br/>
<%
	//Date  로 구하기
	// 월에서 소문자를 사용하면 분이 출력된다. - 여기선 굳이 달에 +1을 하지 않아도 된다.
	SimpleDateFormat fm1 = new SimpleDateFormat("yyyy년 MM월 dd일");
	//여기선 왜 또 메소드를 삽입하나?
	String date1 = fm1.format(new Date());
	out.println("현재시간 년월일 : " + date1);
%>
	<br/>
<%
	SimpleDateFormat fm2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
	String date2 = fm2.format(new Date());
	out.println("현재시간 시분초 : " + date2);
%>


</body>
</html>