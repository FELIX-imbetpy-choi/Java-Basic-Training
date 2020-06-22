package voi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A7_Gugu
 */

	//이름 바꿀때 주의 사항  !!!! 파일 이름을 바꿔도 파일일 불러주는 이름인 @webServlet 이 바뀌지 않기 때문에 바꿔주어야 한다.
@WebServlet("/A7_2Gugu")
public class A7_2Gugu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A7_2Gugu() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   
        int num1 = Integer.parseInt(request.getParameter("num"));
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        
          writer.println("<html>");
	      writer.println("   <head>");
	      writer.println("   </head>");
	      writer.println("   <body>");
	      writer.println(" <table border= 1 >");
	      writer.println(" <tr>");
        
        for(int i = 1; i <= 9; i++) {
           for(int j = num1; j <= num1+2; j++) {
              
        	      writer.println(" <td>");
        	      writer.print(j + " X " + i + " = " + (j * i) + "\t");
        	      writer.println(" </td>");
        	      
           }
           writer.println(" </tr>");
 	       writer.println(" <table> ");
 	       writer.println("   </body>");
 	       writer.println("</html>");
           writer.println(" <br/>");
           writer.println();
           
           
        }
        
        
     
     }
}