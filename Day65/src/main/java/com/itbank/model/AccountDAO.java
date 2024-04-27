package com.itbank.model;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.itbank.model.vo.AccountVO;

@Repository
public class AccountDAO {
	
	@Autowired
	private JdbcTemplate jt;	// 데이터베이스 가져오기
	
	private RowMapper<AccountVO> rm = (ResultSet rs, int rowNum) -> {
		AccountVO row = new AccountVO();
		
		row.setEmail(rs.getString("email"));
		row.setIdx(rs.getInt("idx"));
		row.setJ_date(rs.getDate("j_date"));
		row.setNick(rs.getString("nick"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
	
		return row;
	};
	
	public String test() {
		String sql = "select banner from v$version";
		
		return jt.queryForObject(sql, String.class);
	}

	public List<AccountVO> selectAll() {
		String sql = "select * from account order by idx desc";
		
		return jt.query(sql, rm);
	}
	
	public int insert(AccountVO input) {
		String sql = "insert into account(userid, userpw, nick, email) "
				+ "values(?, ?, ?, ?)";
		
		String userid = input.getUserid();
		String userpw = input.getUserpw();
		String nick = input.getNick();
		String email = input.getEmail();
		
		return jt.update(sql, userid, userpw, nick, email);
		// 1행 들어갔다는 뜻(즉 1이 정수로 처리 -> 그래서 int 사용)
	}
	
	public int delete(AccountVO input) {
		String sql = "delete from account where idx = ?";
		
		int idx = input.getIdx();
		
		return jt.update(sql, idx);
		
	}
	
	public int update(AccountVO input) {
		String sql = "update account set "
				+ "userpw = ?, nick = ?, email = ? "
				+ "where idx = ?";
		
		String userpw = input.getUserpw();
		String nick = input.getNick();
		String email = input.getEmail();
		int idx = input.getIdx();
		
		return jt.update(sql, userpw, nick, email, idx);
	}
	
	// 해설
	
//	public AccountVO selectOne(int idx) {
//		String sql = "select * from account where idx = ?";
//		
//		Object[] args = new Object[] { idx };
//		
//		return jt.queryForObject(sql, args, rm);
//	}
}
