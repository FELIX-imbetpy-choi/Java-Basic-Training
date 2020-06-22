package voi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//20181021 복습완료 ★

//**

@WebServlet("/date")
public class A2_Date extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A2_Date() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      GregorianCalendar now = new GregorianCalendar();
      String date = String.format("%TF", now);
      String time = String.format("%TT", now);
      
      
      PrintWriter writer = response.getWriter();
      writer.println("<html>");
      writer.println("   <head>");
      writer.println("   </head>");
      writer.println("   <body>");
      writer.println("오늘의 날짜 : " + date + "입니다." + "<br/>");
      writer.println("현재의 시각 : " + time + "입니다" + "<br/>");
      writer.println("   </body>");
      writer.println("</html>");
   }


   
//-----------------------------------------   
   
}
