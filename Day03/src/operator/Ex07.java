package operator;

public class Ex07 {
	public static void main(String[] args) {
		// 논리 연산자 : true / false를 연산
		// ※ 전치 > 산술 > 비교 > 논리 > 대입 > 후치
		
		// 1. && : and, 양쪽 모두가 참이면 결과가 참
		System.out.println("true  and true  결과 : " + (true && true));
		System.out.println("true  and false 결과 : " + (true && false));
		System.out.println("false and true  결과 : " + (false && true));
		System.out.println("false and false 결과 : " + (false && false));
		System.out.println();
		
		// shift + \
		// 2. || : or, 양쪽 모두 거짓이면 결과가 거짓
		System.out.println("true  and true  결과 : " + (true || true));
		System.out.println("true  and false 결과 : " + (true || false));
		System.out.println("false and true  결과 : " + (false || true));
		System.out.println("false and false 결과 : " + (false || false));
		System.out.println();
		
		// 3. | : not, 참을 거짓으로 거짓을 참으로
		// ※ 산술 연산자보다 우선순위가 높다
		System.out.println("not true  결과 : " + !true);
		System.out.println("not false 결과 : " + !false);
	}
}

