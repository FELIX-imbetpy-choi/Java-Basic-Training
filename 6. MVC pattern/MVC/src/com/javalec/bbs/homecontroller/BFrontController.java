package com.javalec.bbs.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.bbs.command.BCommand;
import com.javalec.bbs.command.BContentCommand;
import com.javalec.bbs.command.BDeleteCommand;
import com.javalec.bbs.command.BListCommand;
import com.javalec.bbs.command.BUpdateCommand;
import com.javalec.bbs.command.BWriteCommand;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do") //.do 로 들어오는 것을 처리해주겠다!
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    //----------------------------------- 모든 접속을 actionDo 로 보내준다 ---------------------------------
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet");
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request,response);
	}
	
	
	//--------------------------------------들어와서 get post 가 모두 ActionDo 로 ------------------------------------------------

	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		// 출력 페이지와 커멘드를 정의해준다.
		String viewPage = null;
		BCommand command = null;
		// 전체 주소 중에서 /list.do 와 같은 부분을 띄어서 switch 문에 넣어주기 위한 과정.
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		// 접근을 나누어 실행할 부분을 클래스별로 실행한다.
		switch (com) {
		case ("/list.do"):
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
		
		case("/write_view.do"):
			viewPage = "write_view.jsp";
			break;
			
		case("/write.do"):
			command = new BWriteCommand();
		    command.execute(request, response); // db에 넣었다는 것
		    viewPage = "list.do";
			break;
		
		case("/content_view.do"):
			command = new BContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
			break;
			
		case("/delete.do"):
			command = new BDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
			
		case("/update.do"):
			command = new BUpdateCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
		}
		// 각 command class 가 실행되고 
		
		// 정의해준 view page 실행.
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
	
	
	
}
