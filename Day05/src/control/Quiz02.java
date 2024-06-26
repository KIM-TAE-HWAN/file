package control;

import java.util.Scanner;

/*
 	점수 등급)
 	학생의 3과목 성적을 입력 받는다
 	성적의 합계와 평균을 출력하고 평균에 따른 등급을 출력하라
 	
 	등급표)
 	100 ~ 90 : A
 	89 ~ 80 : B
 	79 ~ 70 : C
 	69 ~ 60 : D
 	59 ~ 0 : F
 */
public class Quiz02 {
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
		if (avg >= 90) {				// if (avg >= 90) 	   grade = 'A'; 
			grade = 'A';				// else if (avg >= 80) grade = 'B';
		}								// else if (avg >= 70) grade = 'C';
		else if (avg >= 80) {			// else if (avg >= 60) grade = 'D';
			grade = 'B';				// else 		 	   grade = 'F'; 도 가능하다(괄호가 필요없다)
		}
		else if (avg >= 70) {
			grade = 'C';
		}
		else if (avg >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.printf("등급 : %c", grade);
		
		sc.close();
	}
}
