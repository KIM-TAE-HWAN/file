package loop;

import java.util.Scanner;

/*
 	1. 구구단 2단을 단일 반복으로 출력
 	단, x1 ~ x9까지
 	
 	2. 1번을 중첩 반복으로 변경 후 구구단 2단을 8번 출력
 	
 	3. 2번을 변경해서 구구단 2단 ~ 9단 출력
 	
 	4. 역순으로 출력 (9x9 ~ 2x1)
 */
public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("구구단 단수를 입력 :");
		n = sc.nextInt();
		
		for(int i =	1; i<=9; i++) {
			
			System.out.printf("%d x %d = %d\n", n , i , (i*2));									
		}
		System.out.println();

//		2)		
//		System.out.print("구구단 단수를 입력 :");
//		n = sc.nextInt();
		
//		for(int i =	1; i<=8; i++) {
//			for (int j =1; j <=9; j++)
//			System.out.printf("%d x %d = %d\n", n , j , (j*2));									
//		}
//		System.out.println();

//		3)
//		System.out.print("구구단 단수를 입력 :");
//		n = sc.nextInt();
		
//		for(int i =	2; i<=9; i++) {
//			for (int j =1; j <=9; j++)
//			System.out.printf("%d x %d = %d\n", i , j , i*j);									
//		}

//		4)
		System.out.print("구구단 단수를 입력 :");
		n = sc.nextInt();
		
		for(int i =	9; i>=2; i--) {
			for (int j =9; j >=1; j--)
			System.out.printf("%d x %d = %d\n", i , j , i*j);									
		}
		sc.close();
	}		
}
