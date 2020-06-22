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

	<form action = "A2_2userInfoup.jsp" method = "get">

	

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
            	아이디 : 
         </td>
         <td>
                <input type ="text"name="userId"/><br/>
         </td>
      </tr>
      
      <tr>
         <td>
       	   		  패스워드 :
         </td>
         <td>
         	    <input type ="password"name="userPas"/><br/>
         </td>
      </tr>
      
      <tr>
         <td>
          			  성별구분 :
         </td>
         <td>
         		    <input type ="radio"name="gender"value="man"checked="checked"/>남
         		    <input type ="radio"name="gender"value="woman"/>여<br/>
         </td>
      </tr>
      
         <tr>
         <td>
        	 		   메일수신여부 : 
         </td>
         <td>
           			 <input type="checkbox"name="lang1"value="공지메일"/>공지메일
          			 <input type="checkbox"name="lang2"value="광고메일"/>광고메일
        		     <input type="checkbox"name="lang3"value="배송확인메일"/>배송확인메일<br/>
         </td>
      </tr>
      
      
         <tr>
         <td>
       	 			   직업 : 
         </td>
         <td>
           			
           			 <select name = "proto">
           			 
           			 <option>학생</option>
          			 <option>직장인</option>
           			 <option>사업가</option>
        			 </select><br/>
         </td>
      </tr>
      
      
      <tr>
         <td></td>
         <td align = "left">
            <input type = "submit"name = "okBtn"value="ok">
            <input type = "reset"  name = "rsBtn"value="rs">
         </td>
      </tr> 
      
      </form>
      
      
        
   </table>

</body>
</html>