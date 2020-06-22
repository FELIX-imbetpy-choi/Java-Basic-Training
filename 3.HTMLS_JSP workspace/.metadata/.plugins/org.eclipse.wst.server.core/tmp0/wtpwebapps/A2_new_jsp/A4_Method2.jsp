<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>거듭제곱 구하기</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<!-- + Math.pow(3,4) 를 쓰면  double 값으로 자바메소드에서 자동으로 3의 4승을 출력해줌-->


<p> 2 ^ 0 = <%=dudu(0) %></p>
<p> 2 ^ 1 = <%=dudu(1) %></p>
<p> 2 ^ 2 = <%=dudu(2) %></p>
<p> 2 ^ 3 = <%=dudu(3) %></p>
<p> 2 ^ 4 = <%=dudu(4) %></p>

<%= Math.pow(3, 9) %>

</body>
</html>

<%!
private int dudu(int a){
	int du = 1;
	for(int i = 1; i <= a; i++){
		du *=  2;
	}
	return du;
}



%>