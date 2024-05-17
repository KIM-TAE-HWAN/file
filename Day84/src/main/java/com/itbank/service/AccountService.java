package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;
import com.itbank.components.SHA512;

@Service
public class AccountService {

	@Autowired
	private SHA512 hash;
	
	@Autowired
	private AccountDAO dao;

	public List<AccountVO> getAccs() {

		return dao.selectAll();
	}

	public AccountVO getAcc(AccountVO input) {
		String pw = input.getUserpw();
		input.setUserpw(hash.getHash(pw));
		
		// System.out.println(hash.getHash(pw));
		
		return dao.selectOne(input);
	}

		public int addAcc(AccountVO input) {
		String pw = input.getUserpw();
		input.setUserpw(hash.getHash(pw));
		
		
		return dao.insert(input);
	}
	

}
