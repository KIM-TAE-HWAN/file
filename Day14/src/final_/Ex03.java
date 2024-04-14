package final_;

class A {
	
	final void method_A() {
		System.out.println("A클래스의 매서드");
	}
}

class B extends A{
	/*
	- final 매서드는 오버라이드가 불가능하다
	- 상속을 못 받는게 아니다!
	@Override // 재정의
	void method_A() {
		System.out.println("B에서 오버라이드한 매서드");
	}
	*/
}
/*
 - final 클래스는 더 이상 상속이 불가능하다
 - 못 쓰는 클래스는 아니다!
 
class C extends B {
	
}
*/

public class Ex03 {
	public static void main(String[] args) {
		B b = new B();
		
		b.method_A();
		
		
		
	}
}
