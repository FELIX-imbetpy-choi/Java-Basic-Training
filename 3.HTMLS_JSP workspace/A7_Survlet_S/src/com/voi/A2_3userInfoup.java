package com.voi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A2_3userInfoup
 */
@WebServlet("/A2_3userInfoup")
public class A2_3userInfoup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A2_3userInfoup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String str1 = (String) request.getAttribute("lang1");
		String str2 = (String) request.getAttribute("lang2");
		String str3 = (String) request.getAttribute("lang3");
		
		PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println(" 이름 :");
        writer.println(request.getAttribute("name"));
        writer.println(" <br/>");
        writer.println(" 아이디 :");
        writer.println(request.getAttribute("sub"));
        writer.println(" <br/>");
        writer.println(" 패스워드 :");
        writer.println(request.getAttribute("intro"));
        writer.println(" <br/>");
        writer.println(" 성별 :");
        writer.println(request.getAttribute("gender"));
        writer.println(" <br/>");
        writer.println(" 공지수신 :");
        writer.println(judg(str1));
        writer.println(" <br/>");
        writer.println(" 광고수신 :");
        writer.println(judg(str2));
        writer.println(" <br/>");
        writer.println(" 배송메일수신 :");
        writer.println(judg(str3));
        writer.println(" <br/>");
        writer.println(" 직업	 :");
        writer.println(request.getAttribute("proto"));
	}


	private String judg( String str ) {
		String cas1 = "받지 않습니다";
		String cas2 = "허용";
		String judg = null;
		if(str == null) {
			judg = cas1;
		}
		else {
			judg = cas2;
		}
		return judg;
	}
}
