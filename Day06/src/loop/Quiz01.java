package loop;

import java.util.Scanner;

/*
	1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
	
	2. 정수를 입력 받아서 n ~ 1까지 일렬로 출력
	
	3. 정수를 입력 받아서 1 ~ n까지 누적 합을 출력
	
	4. 정수를 입력 받아서 1 ~ n까지 누적 곱을 출력
	
	5. 0을 입력 받을 때까지 정수를 계속 입력 받고
	   0을 누르면 이때까지 입력한 점수의 합계/평균을 출력
	   
	6. 정수를 입력받아서 거꾸로 수를 출력
	   ex) 입력 : 123 -> 출력 : 321
 */
public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1)
		int n, i = 1;
		
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
					
			while (i <= n) {	
				
				System.out.printf(i + " ");
				i++;	
			}
			
		// 2,3,4)
			int fac = 0;
			int sum = 0;
			i--;
			while (i >= 1) {	
				
				System.out.printf(i + " ");
				sum += i;
				fac *= i;
				i--;	
			}
			System.out.println("\n합 : " + sum);
			System.out.println("\n곱 : " + fac);
			
			sc.close();
	}
}
