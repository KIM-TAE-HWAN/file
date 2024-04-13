package loop;
/*
  	나머지(%) 용도
	1. 배수 판별
 	2. 숫자의 자리 추출
	3. 숫자 범위 제어
	
	n % 3  -> 0,1,2 
	
	ex)
	3 % 3 = 1 ...0
	4 % 3 = 1 ...1
	5 % 3 = 1 ...2
	6 % 3 = 2 ...0
	7 % 3 = 2 ...1
	8 % 3 = 2 ...2
 */

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 6)
		Scanner sc = new Scanner(System.in);
		int n, rev = 0;
		
		System.out.print("정수 :");
		n = sc.nextInt();
		
		while(n != 0) {
			System.out.print(n % 10);
			rev = rev * 10 + n %10;
			n /=10;
		}
		
		System.out.println("\nrev = " + rev);
		System.out.println("rev * 2 " + rev * 2);
		sc.close();
/*
 	1. n = 123, rev = 0
 	rev = rev * 10 + n %10;
 		= 0 + 3
 		= 3
 	n / 10 = 123	
 	n = 12
 	
 	2. n = 12, rev = 3
 	
 	rev = rev * 10 + n %10;
 		= 30+2
 		= 32      한자리씩 밀려나감 
 	n = 1
 		
 	3. n =1 , rev = 32
 	rev = rev * 10 + n %10;
 		= 32 * 10 + 1 % 10
 		= 321
 	n = 0
 	
 	4. n=0, rev=321
 */
	}
}
