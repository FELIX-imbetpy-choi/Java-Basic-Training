<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포인트 - 변수를 배열로 받아오는</title>
<!-- 20181021 복습완료 ★ -->

</head>
<body>

<table border = "0">

	<!-- 각 명령이 들어갈 자리에 *나 다른 표시를 사용해 표시한 후 찾아 바꾸기 하면 금방 작업할 수 있다. -->

	<!-- get 방식과 post 방식이 있다 post 는 뒤에 변수가 다 표신된다. -->
	<!-- form action? 어떤 역할을 하는 건가? form tag 구성 전부 다 찾아서 이해하기-->
	<form action = "A4_2HeadTest" method = "get">


   <table border="0" align = "center">
   	<h>당신의 성격을 테스트 합니다. 데이터를 입력한 후 확인 버튼을 누르세요</h>
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
          			  좋아하는 색은? :
         </td>
         <td>
         		    <input type ="radio"name="color"value="빨강"checked="checked"/>빨강
         		    <input type ="radio"name="color"value="파랑"/>파랑<br/>
         </td>
      </tr>
      
         <tr>
         <td>
       	 			    좋아하는 동물은?  : 
         </td>
         <td>
           			 <select name = "proto">
           			 <option>댕댕이</option>
          			 <option>냐옹이</option>
           			 <option>비얌</option>
           			 <option>몽끼</option> 
         </td>
      </tr>
      
         <tr>
         <td>
        	 		   좋아하는 음식은? (모두 고르세요) : 
         </td>
         <td>
           			 <input type="checkbox"name="foo"value="짜장"/>짜장
          			 <input type="checkbox"name="foo"value="잠뽕"/>짬뽕
        		     <input type="checkbox"name="foo"value="탕슉"/>탕슉<br/>
         </td>
      </tr>
      
      
      
      <tr>
         <td></td>
         <td align = "left">
            <input type = "submit"name = "okBtn"value="ok">
            
         </td>
      </tr> 
      
      
        
   </table>
   </form>

</body>
</html>