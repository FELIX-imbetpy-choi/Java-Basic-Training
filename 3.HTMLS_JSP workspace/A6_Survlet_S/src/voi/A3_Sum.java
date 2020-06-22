package voi;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//20181021 복습완료 ★
/**
 * Servlet implementation class Sum
 */
@WebServlet("/Sum")
public class A3_Sum extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A3_Sum() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int sum = 0;
      int i = 1;
      int j = 2;
      
      request.setAttribute("sum", i + j);
      RequestDispatcher rd = request.getRequestDispatcher("A3_sumResult.jsp");
      rd.forward(request, response);
   }
}

//서블렛은 계산해주는곳으로 생각하고 ->
