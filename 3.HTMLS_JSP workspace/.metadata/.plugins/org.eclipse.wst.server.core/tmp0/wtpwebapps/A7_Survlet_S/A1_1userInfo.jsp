<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<table border = "0">

	<!-- 각 명령이 들어갈 자리에 *나 다른 표시를 사용해 표시한 후 찾아 바꾸기 하면 금방 작업할 수 있다. -->

	<!-- get 방식과 post 방식이 있다 post 는 뒤에 변수가 다 표신된다. -->
	<!-- form action? 어떤 역할을 하는 건가? form tag 구성 전부 다 찾아서 이해하기-->
	<form action = "A1_2userInfo.jsp" method = "get">


   <table border="0" align = "center">
      <tr>
     	 <td>
             	  이름 : 
    	  </td>
    	  <td>
     			 <input type ="text"name="uerName"/><br/>
     	  </td>
      </tr>
      
      <tr>
         <td>
            	제목 : 
         </td>
         <td>
                <input type ="text"name="userId"/><br/>
         </td>
      </tr>
    
         <tr>
         <td>
          			  자기소개 :
         </td>
         <td>
					<textarea rows="5" name = "Itro" cols="20">간단하게 입력하세요.</textarea><br/>
         </td>
      </tr>
     
      <tr>
         <td>
         <td align = "left">
            <input type = "submit" name = "okBtn"value="ok">
            <input type = "reset"  name = "rsBtn"value="rs">
         </td>
      </tr> 
      
      </form>
      
        
   </table>
	

</body>
</html>