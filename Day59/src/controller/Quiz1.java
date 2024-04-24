package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Quiz1")
public class Quiz1 extends HttpServlet {

	private static final long serialVersionUID = 4L;
	
	//private void forward(String url, HttpServletRequest request, HttpServletResponse response) 
	//		throws ServletException, IOException {
	//	
	//	RequestDispatcher rd;
	//	rd = request.getRequestDispatcher("/WEB-INF/" + url);
	//	
	//	rd.forward(request, response);
	//}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		// forward("quiz1.jsp", request, response);
		RequestDispatcher rd; 
		rd = request.getRequestDispatcher("/WEB-INF/quiz1.jsp");
		 
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");		
		int age = Integer.parseInt(request.getParameter("age"));
		
		String msg = "";
		
		
		if (age >= 19) {
			msg = "성인입니다";
		}
		else {
			msg = "미성년자입니다";
		}
		
		request.setAttribute("msg", msg);
		
		
		// forward("quiz1_result.jsp", request, response);
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/WEB-INF/quiz1_result.jsp");
		
		rd.forward(request, response);
	}

	
}
