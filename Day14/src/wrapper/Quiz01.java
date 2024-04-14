package wrapper;

import java.util.Random;
import java.util.Scanner;

/*
	1. words라는 문자열에서 랜덤으로 문자 8자리를 추출해서 문자열을 생성한다
	2. 그 후 추출한 문자열을 화면에 출력 후 사용자에게 동일한 문자열을 입력 받는다
	3. 문자열이 일치하면 인증 성공을 화면에 출력
 */
public class Quiz01 {
	public static void main(String[] args) {
		String words = "abcdefghijklmnopqrstuvwxyz";
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n;
		String auth = "", answer;
		
		for (int i =1; i <= 8; i++) {
			n = ran.nextInt(words.length());
			auth += words.charAt(n);
//			System.out.printf("words[n] : " + words.charAt(n) + "\n");
		} 
		
		
		System.out.println("인증문자 : " + auth);
		System.out.print("입력 : ");
		answer = sc.next();
		
		
		String result = "인증실패";
		
		if (auth.equals(answer)) {
			result = "인증성공";
		}
		
		System.out.println("결과 : " + result);
//		System.out.println("\nanswer : " + answer);
//		System.out.println(auth.equals(answer));
		
		sc.close();
	}
}
