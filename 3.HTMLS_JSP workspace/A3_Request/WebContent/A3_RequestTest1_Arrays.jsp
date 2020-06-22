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

<!-- .jsp 작성 안해서 실행이 안됐었다... -->
<!-- get 방식에서는 변수들이 모두 ? 뒤에 표시됨 / post 는 변수가 표시 되지 않는다 -->
<p>	양식을 모두 채우고 확인 버튼을 눌러주세요.</p><br/>

 <table border="0">
  <form action="A3_RequestTest2.jsp" method = "get">
     <tr>
      <td>
         이름      :
      </td>
      <td>
         <input type = text name = strname><br/>
      </td>
   </tr>
   <tr>
      <td>
         ID      :
      </td>
      <td>
         <input type = text name = strId><br/>
      </td>
   <tr>
      <td>
         패스워드   :   
      </td>
      <td>         
         <input type = password name = strpass><br/>
      </td>
   </tr>
   <tr>
      <td>
      취미      :
      </td>
      <td>

         <input type = "checkbox" name = hob value = 독서>독서
         <input type = "checkbox" name = hob value = 요리>요리
         <input type = "checkbox" name = hob value = 조깅>조깅
         <input type = "checkbox" name = hob value = 수영>수영<br/>
      </td>
   </tr>
   <tr>
      <td>
      전공      :
      </td>
      <td>
         <input type = radio name = major value = 국어 checked = checked>국어
         <input type = radio name = major value = 영어>영어
         <input type = radio name = major value = 디자인>디자인<br/>
      </td>
   </tr>
   <tr>
      <td>
      Protocol:
      </td>
      <td>
         <select name = proto>
            <option>http</option>
            <option>ftp</option>
            <option>smtp</option>
            <option>pop</option>
         </select><br/>
      </td>
   </tr>
      <td>
      <input type = submit value = "확인"><input type = reset value = "취소"><br/>
      </td>
   </table>
</form>

</body>
</html>