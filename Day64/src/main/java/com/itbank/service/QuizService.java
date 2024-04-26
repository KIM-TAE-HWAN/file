package com.itbank.service;

import org.springframework.stereotype.Service;

import com.itbank.model.vo.AccountVO;

@Service
public class QuizService {
	
	AccountVO[] acc = {
            new AccountVO("itbank", "it", "아뱅"),
            new AccountVO("test1", "1", "test11"),
            new AccountVO("test2", "2", "test22")
    };

	
	public String login(AccountVO input) {
		String msg = "로그인 실패";
		
		for(int i = 0; i < acc.length; i++) {
			if(acc[i].equals(input)) {
				msg = acc[i].getNick() + "님 로그인 성공";
				break;
			}
		}
		
		return msg;
	}
}
