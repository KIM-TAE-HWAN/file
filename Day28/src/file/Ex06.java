package file;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class User {
	private int idx;
	private String userid, userpw;
	
	@Override
	public String toString() {
	String msg = "%d %s %s";
	msg = String.format(msg, idx, userid, userpw);
	
	return msg;
}

	void load(Scanner sc) {
		idx = sc.nextInt();
		userid = sc.next();
		userpw = sc.next();
	}
}	

public class Ex06 {
	public static void main(String[] args) throws IOException {
		// Scanner를 활용하면 특정 양식의 데이터를 구분해서 가져오기 좋다
		File file = new File("E:\\file test\\users.txt");
		Scanner sc = new Scanner(file);
		
		// User[] users = new User[2];
		LinkedList<User> users = new LinkedList<User>();
		User user;
		
		while (sc.hasNext()) {			// 문서에 다음이 없을 때까지 반복
			user = new User();			// 한 계정의 정보를 서장일 객체 설정
			user.load(sc);				// 파일에서 읽어온 정보를 객체에 저장
			
			users.add(user);				// 리스트에 저장
			System.out.println(user);
		}
		
		// System.out.println(users);
				
//		1)				
//		for(int i = 0; i < users.length; i++) {
//			users[i] = new User();
//			users[i].load(sc);
//			
//			System.out.println(users[i]);
//		}

//		2)
//		User user1 = new User();
//		user1.load(sc);
//		
//		System.out.println(user1);
//		
//		User user2 = new User();
//		user2.load(sc);
//		
//		System.out.println(user2);
		
		sc.close();
		}
}
