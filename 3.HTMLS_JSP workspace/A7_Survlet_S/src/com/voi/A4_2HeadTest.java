package com.voi;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A4_2HeadTest
 */
@WebServlet("/A4_2HeadTest")
public class A4_2HeadTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A4_2HeadTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset = utf-8");
		
		String name = request.getParameter("userName");
		String color = request.getParameter("color");
		String proto = request.getParameter("proto");
		String [] foo = request.getParameterValues("foo");
		
		
		// 자바에서는 입력이 없는 배열의 length는 0 이 나오지만 웹에서는 null값으로 나온다?
		
		 PrintWriter writer = response.getWriter();
	     
	      writer.println("<html>");
	      writer.println("   <head>");
	      writer.println("   </head>");
	      writer.println("   <body>");
	      writer.println(color+"을 좋아하는 당신은"+proto+"그리고");
	      if(foo == null) {
	    	  
	      }
	      else {
	      int leng = Array.getLength(foo);
	      for(int a = 1; a <= leng; a++) {
	    	  writer.println(""+foo[a-1]);
	      }
	      }
	      
	      writer.println("을 좋아하는 성격입니다.");
	      writer.println("   </body>");
	      writer.println("</html>");
	      
	      
	}
	
}

