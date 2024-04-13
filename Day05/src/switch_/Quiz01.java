package switch_;

import java.util.Scanner;

/*
 	control.Quiz2의 문제를
 	switch로 변경해서 다시 풀어보세요
 */
public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, total;
		double avg;
		char grade;
			System.out.printf("성적 3개를 입력하시오 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		total = n1 + n2 + n3;
		avg = total / 3.0;
		
		System.out.printf("합계 : %d, 평균 : %.2f\n", total, avg);
		
		int A = (int) (avg/10);
		
		switch(A) {
		case 10: case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
		}
		
		
		System.out.printf("등급 : %c", grade);
		
		sc.close();
	}
}
