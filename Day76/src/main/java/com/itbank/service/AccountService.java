package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itbank.exception.LoginException;
import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;
	
	@Transactional(readOnly = true)
	public List<AccountVO> getAccounts() {
		return dao.selectAll();
	}
	

//	public AccountVO login(AccountVO user) {
//		
//		return dao.selectOne(user);
//	}
	
	@Transactional(readOnly = true)
	public AccountVO login(AccountVO input) throws LoginException {
		AccountVO user = dao.selectOne(input);
		
		//System.out.println(user);
		// 일치하는 계정 정보가 없으면 null이 반환된다.
		if (user == null) {
			throw new LoginException("로그인 실패");
		}
		
		return user;
	}
	

	public int addAccount(AccountVO input) {
		
		return dao.insert(input);
	}
}
