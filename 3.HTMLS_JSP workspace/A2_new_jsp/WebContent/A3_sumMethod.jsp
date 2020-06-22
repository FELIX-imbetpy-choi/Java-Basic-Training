<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp에서 메소드 사용하기</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<!-- + JSP 내에서 메소드는 <+%+! 를 선언하면 메소드 사용이 가능하다. -->
<!-- + 메소드를 출력 하려면 +<+%+= 메소드명을 사용하면 된다.  -->

 <p> 2 + 1 = <%=decAdd(2,1) %> <br/></p>
 <p> 2 + 2 = <%=decAdd(2,2) %> <br/></p>
 <p> 2 + 3 = <%=decAdd(2,3) %> <br/></p>
 <p> 2 + 4 = <%=decAdd(2,4) %> <br/></p>
 <p> 2 + 5 = <%=decAdd(2,5) %> <br/></p>
 

</body>
</html>

<!-- + 메소드는 아무데나 작성해도 된다. 소스보기를 해도 보이지 않는다 -->
<%!
	private int decAdd(int a, int b){
	int result = a + b;
	return result;
}

%>