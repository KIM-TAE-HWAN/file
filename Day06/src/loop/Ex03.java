package loop;

// 무한반복
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.print("정수 입력 (0 : 종료) ");
			n = sc.nextInt();
			
			if (n == 0) {
				break;			// if는 break의 영향을 받지 않는다
								// 0일때 실행되게 조건을 세팅
			}
			System.out.println("n = " + n + "\n");
		}
		sc.close();
	}
}
