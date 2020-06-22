package voi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A_2Suvlet
 */
@WebServlet("/A5_2SurvletTest")
public class A5_2SurvletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A5_2SurvletTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		   request.setCharacterEncoding("utf-8");
		   String count = request.getParameter("count");
		   String size = request.getParameter("size");
		   String color = request.getParameter("color");
		   
		   String fileName = "test.txt";
		   String result;
		   
		   //application.getRealPath 는 여기서 사용하지 못함 - getServlercontext로 바꿔
		   PrintWriter writer = null;
		   try{
		      String filePath = getServletContext().getRealPath("test.txt");
		      writer = new PrintWriter(filePath);
		      writer.println("수량 : " + count);
		      writer.println("크기 : " + size);
		      writer.println("색상 : " + color);
		      result = "success";
		      
		   }catch(IOException ioe){
		      result = "fail";
		   }finally{
		      try{
		         writer.close();
		      }catch(Exception e){
		         result = "fail";
		      }
		   }
		   
		   response.sendRedirect("A5_3SurvletTest.jsp?result=" + result);
	}

	//--------------------------------------------------------------------
}
