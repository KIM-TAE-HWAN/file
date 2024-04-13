package loop;

import java.util.Scanner;

/*
	1. N X N 별찍기
	입력 : 5
	
	*****
	*****
	*****
	*****
	*****
	
	2. 직각 삼각형
	입력 : 5
	*
	**
	***
	****
	*****
	
	3. 2번을 위/아래 반전
	입력 : 5
	*****
	****
	***
	**
	*
	
	4. 2번을 좌/우 반전
	입력 : 5
	    *
	   **
	  ***
	 ****
	*****
	
	5. 4번을 위/아래 반전
	입력 : 5
	*****
	 ****
	  ***
	   **
	    *
 */
public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("입력 :");
		n = sc.nextInt();
//      1)
//		for (int i =1; i <= n; i++) {		
//			for (int j = 1; j <= n; j++) {	
//			System.out.print('*');
//			}
//			System.out.println();
//		}
//		system.out.println();	
		
//		2)
//		for (int i =1; i <= n; i++) {		
//			for (int j = 1; j <= i; j++) {	
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//     	3)
		for (int i = 0; i < n; i++) {		
			for (int j = 0; j < n - i; j++) {	
			System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
//		4)		
	}
}	