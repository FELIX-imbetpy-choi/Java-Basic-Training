<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름 입력</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

	<!-- 각 값들에 따운표가 들어가지 않아도 인식된다? -->
	<!-- 취소는 알아서 누르면 지워지도록 되어있다 버튼기능이 -->
	<!-- get 방식에선 '?' 이후에 변수명과 값을 알수있다. -->
	<!--  메소드 타입은 바꾸기만 하면 바로 적용된다 host 는 변수명 값 다 드러나지 않는다.보통 게스트에서 시험 다 하고 호스트로 바꾼다. -->
	
	이름을 입력하고 확인 버튼을 누르세요. <br/><br/>
	<form action = "A2_Request02.jsp" method = "host">
	이름 : <input type = text name = strname><br/>
	
	아이디 : <input type = text name = strid><br/>
	
		 <input type = submit value = "확인">
		 <input type = reset value = "취소" >
	</form>

</body>
</html>