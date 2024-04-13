package operator;

public class Quiz02 {
	public static void main(String[] args) {
		// 1. 정수 n1이 짝수인지 판별하는 코드를 작성
		int n1 = 10;
		String number  = (n1%2 == 0) ? "짝수" : "홀수";
		System.out.printf("%d(은)는 %s 입니다\n", n1, number);
		
		// 2. 정수 a, b 중엣 큰 수를 출력 (단, 같으면 아무거나)
		int a = 10, b = 20;
		String input  = (a > b) ? "10" : "20";
		System.out.printf("%d, %d 중 큰 수는 %s 입니다\n", a, b, input);
		
		// 3. 정수 n2가 3과 5의 공배수인지 판별하는 코드를 작성
		int n2 = 15;
		boolean result = (n2 % 3 == 0 && n2 % 5 == 0);
		String multi = "공배수";
		multi += result ? "맞다" : "아님";
 		// String multi = (n2 % 3 == 0 && n2 % 5 == 0) ? "공배수" : "공배수 아님";  직역한 답
		System.out.printf("%d(은)는 3과 5의 %s\n", n2, multi );
		
		// 4. 정수 n3의 절대값을 출력
		int n3 = -9;
		
		n3 = (n3 < 0) ? -n3 : n3;
		
		System.out.println("절대값 : " + n3);
		
				
				
	}
}
