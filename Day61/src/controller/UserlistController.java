package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Mapper;
import model.vo.AccountVO;

@WebServlet("/account")
public class UserlistController extends HttpServlet {


	private static final long serialVersionUID = 200L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String sql = "select * from account order by idx desc";
		DAO dao = new DAO();
		
		Mapper<AccountVO> mp = (ResultSet rs) -> {
			AccountVO row = new AccountVO();
			
			row.setIdx(rs.getInt("idx"));
			row.setUserid(rs.getString("userid"));
			row.setUserpw(rs.getString("userpw"));
			row.setNick(rs.getString("nick"));
			row.setEmail(rs.getString("email"));
			row.setJ_date(rs.getDate("j_date"));
			
			
			return row;
			
		};
		
		
		req.setAttribute("list", dao.query(sql, mp));
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("/WEB-INF/account/userlist.jsp");
				
		rd.forward(req, resp);
	}
	
	

}
