package voi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sumadd
 */
@WebServlet("/sumadd")
public class A4_Sumadd extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A4_Sumadd() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub

      Addadd(100);
      request.setAttribute("sum1", Addadd(100));
      request.setAttribute("sum2", Addadd(200));
      RequestDispatcher rd = request.getRequestDispatcher("A4_SumResult.jsp");
      rd.forward(request, response);
   }

   private int Addadd(int a) {
      int total = 0;
      for(int i = 1; i <= a; i++) {
         total = total + i;
      }return total;
   }

   
   
   
//------------------------------------------------------------------
}
