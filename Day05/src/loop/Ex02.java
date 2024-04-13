package loop;

import java.util.Scanner;

/*
	연습)
	1. main의 코드를 반복으로  줄여보세요
	2. 1번을 완료 후 입력문으로 변경하여 입력한 구구단이 출력되게 한다
	3. 그 아래 반복을 하나 더 작성해서 역순으로 출력되게 한다 (x9 ~ x1)
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("구구단 단수를 입력 :");
		n = sc.nextInt();
		
			int i = 1;			
			
			while (i <= 9) {	
				System.out.printf("%d x %d = %d\n", n , i , (i*2));
				i++;			
			}
			System.out.println();
			
			sc.close();
			
			int i1 = 9;			
			
			while (i1 >= 9) {	
				System.out.printf("%d x %d = %d\n", n , i1 , (i1*2));
				i1--;			
			}
			sc.close();
		}
}
