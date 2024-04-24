package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;

@WebServlet("/student/delete")
public class Studentdelete extends HttpServlet{

	private static final long serialVersionUID = 300L;
	private String path = "/WEB-INF/student/";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher(path + "delete.jsp");
		
		rd.forward(request, response);
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		StudentDAO dao = new StudentDAO();
		
		int row = dao.delete(idx);
		System.out.println("row : " + row);
		
		response.sendRedirect("/Day59/student/");
	}
	
	

	
}
