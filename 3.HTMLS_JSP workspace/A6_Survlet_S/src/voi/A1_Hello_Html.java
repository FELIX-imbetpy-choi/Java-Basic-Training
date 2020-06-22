package voi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//20181021 복습완료 ★

/**
 * Servlet implementation class Hello
 */
@WebServlet("/A1_Hello_Html")
//20181021 복습완료 ★
public class A1_Hello_Html extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A1_Hello_Html() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("Hello World!");
      
      //자바 내에서 html을 쓰려면 PrintWriter을 선언해 주어야 한다.
      response.setContentType("text/html");
      PrintWriter writer = response.getWriter();      
      writer.println("<html>");
      writer.println("   <head>");
      writer.println("   </head>");
      writer.println("   <body>");
      writer.println("2 ^ 1 = " + decAdd(2, 1) + "<br>");
      writer.println("2 ^ 2 = " + decAdd(2, 2) + "<br>");
      writer.println("2 ^ 3 = " + decAdd(2, 3) + "<br>");
      writer.println("2 ^ 4 = " + decAdd(2, 4) + "<br>");
      writer.println("2 ^ 5 = " + decAdd(2, 5) + "<br>");
      writer.println("2 ^ 6 = " + decAdd(2, 6) + "<br>");
      writer.println("   </body>");
      writer.println("</html>");
   }

   private int decAdd(int num1, int num2) {
      int result = 1;
      for(int i = 1; i <= num2; i++) {
      result = result * num1;
   }return result;
   }
   
   
   
//--------------------------------------------------------------------   
   
   
}