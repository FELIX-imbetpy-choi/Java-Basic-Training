package com.voi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A1_3userInfo
 */
@WebServlet("/A1_3userInfo")
public class A1_3userInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A1_3userInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println(" 이름 :");
        writer.println(request.getAttribute("name"));
        writer.println(" <br/>");
        writer.println(" 제목 :");
        writer.println(request.getAttribute("sub"));
        writer.println(" <br/>");
        writer.println(" 내용 :");
        writer.println(request.getAttribute("intro"));
	}


}
