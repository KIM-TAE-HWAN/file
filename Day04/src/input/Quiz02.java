package input;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 1. 이름, 나이, 주소를 저장 받을 변수를 선언
		String name , address;
		int age;
		
		// 2. 1번의 변수에 데이터를 입력 받는다
		// 단, 주소를 가장 마지막에 입력 받을 것
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		name = sc.next();
		
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("주소를 입력하시오 : ");	
		address = sc.nextLine();
		
		// 3. 결과는 아래와 같다
		// 결과)
		// 이름 : 김민수 (33세)
		// 주소 : 부산 광역시 동래구
		
		System.out.printf("이름 : %s (%d세)\n", name , age);
		System.out.printf("주소 : %s" , address);
		
		sc.close();
		
	}
}
