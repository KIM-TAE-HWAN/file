package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.exception.LoginException;
import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;
	
	@Value("file:E:/profile")
	private Resource rs;
	
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
		
		int profile = user.getProfile();
		int idx = user.getIdx();
		
		String path = (profile == 1) ? idx + "/profile.jpg" : "default.jpg";
		
		user.setImage(path);
		
//		System.out.println(profile);
//		System.out.println(path);
		
		return user;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public int addAccount(AccountVO input) throws IOException {
		int row = dao.insert(input);
		
//		if (row != 0) {
//			// 1. select로 현재 가입한 계정의 번호(idx)를 가져온다		
//			AccountVO user = dao.selectOne(input);
//			int idx = user.getIdx();
//			
//			// 2. 해당 번호(idx)로 프로필 폴더 안에 번호 폴더를 생성
//			File file = new File("E:\\profile/" + idx);
//			file.mkdir();
//			
//		}
		
		if (row != 0) {
//			1. select로 현재 가입한 계정의 번호(idx)를 가져온다
			int idx = dao.selectIdx();
			
//			2. 해당 번호(idx)로 프로필 폴더 안에 번호로 폴더를 생성
			File profile = rs.getFile();
			File userFolder = new File(profile, idx + "");
			
			userFolder.mkdir();
		}
		
		return row;
	}

	
	public void profileUpdate(AccountVO input) throws IOException {
		File profile = rs.getFile();
		MultipartFile upload = input.getUpload();
				
		// 이름이 있다 -> 파일이 전송됨
		if (!"".equals(upload.getOriginalFilename())) {
			String name = input.getIdx() + "/profile.jpg";
			
			File dest = new File(profile, name);
			upload.transferTo(dest);
			
			input.setProfile(1);
		}
		
		dao.update(input);
		
	}

	public int delAcc(int idx) throws IOException {
		int row = dao.delete(idx);
		
		if(row != 0) {
			// 1. 현재 계정의 프로필 폴더를 가져온다
			File dir = new File(rs.getFile(), idx + "");
			
			// 2. 그 폴더 안의 모든 파일을 제거한다
			for (File file : dir.listFiles()) {
				file.delete();
			}
			
			// 3. 빈 폴더가 되면 폴더를 삭제한다
			dir.delete();
		}
		
		return row;
			
	}
}
