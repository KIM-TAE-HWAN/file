package method;

import java.util.Arrays;

/*
	매서드 오버로딩(overloading)
	- 같은 이름의 매서드를 여러개 작성하는 기법
	
	규칙)
	1. 매서드 이름이 동일해야 한다
	2. 매개변수 형태가 달라야 한다
	3. 반환형은 관계없다  
*/
public class Ex04 {
	static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	static int adder(int n) {
		return 100 + n;
	}
	
	static double adder(double n) {
		return 3.14 + n;
	}
	
	static int adder() {
		return 100 + 200;
	}
	public static void main(String[] args) {
		// java에서느 매서드 호출시 '이름과 전달인자'를 확인해서 호출한다
		// - 일치하는 것이 없으면 당연히 에러가 나옴
		System.out.println("adder(5,6) = " + adder(5,6));
		System.out.println("adder(5) = " + adder(5));
		System.out.println("adder(5.0) = " + adder(5.0));
		System.out.println("adder() = " + adder());
		
//		Arrays.deepToString // 이름이 많으면 overloading
	}
}
