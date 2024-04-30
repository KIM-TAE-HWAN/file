package com.itbank.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.components.SHA512;
import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;
	
	@Autowired
	private SHA512 hash;
	
	public List<AccountVO> getaccounts() {		
		return dao.selectAll();
	}
	
	public AccountVO login(AccountVO user) {
		String pw = user.getUserpw();
		user.setUserpw(hash.getHash(pw));
		
		return dao.selectOne(user);
	}
	
	public int addAccount(AccountVO input) {
		String pw = input.getUserpw();
		input.setUserpw(hash.getHash(pw));
		
		return dao.insert(input);
	}
	
	
	
}
