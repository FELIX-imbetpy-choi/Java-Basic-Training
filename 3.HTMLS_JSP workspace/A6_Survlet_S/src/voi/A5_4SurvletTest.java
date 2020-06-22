package voi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class A5_4SurvletTest
 */
@WebServlet("/A5_4SurvletTest")
public class A5_4SurvletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A5_4SurvletTest() {
        super();
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 System.out.println("4번파일이 실행됨");
		 String filePath;
		 
		 BufferedReader reader = null;
		   try{
			   
		      filePath = getServletContext().getRealPath("test.txt");
		      reader = new BufferedReader(new FileReader(filePath));
		      
		      while(true){
		         String str = reader.readLine();
		         if(str == null) break;
		         System.out.println(str + "<br />");
		      }   //파일 읽어오는 로직 (변하지 않음) 복붙해서 쓰도록!
		   }catch(FileNotFoundException fnfe){
		      System.out.println("파일이 존재하지 않습니다.");
		   }catch(IOException ioe){
			   System.out.println("파일을 읽을 수 없습니다.");
		   }finally{
		      try{
		         reader.close();
		      }catch(Exception e){
		    	  System.out.println("진짜에러");
		      }
		   }
	}
	


}
