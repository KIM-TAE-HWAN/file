package other;

/*
	Java에서는 class의 다중 상속이 불가능하다, 하나만 상속
	- 여러가지 클래스를 상속 받으면 기능이 많아지기 때문에 강력한 상속 방식이다
	- 강력한 상속 방식이지만 안정성이 떨어진다
	- 하지만 다양한 타입을 상속 받으면 업캐스팅도 다양하게 가능한 장점이 있다
	
	interface
	- 자바에서 다중 상속이 가능한 타입
	- 클래스와 비슷하게 작동되지만 내부가 모두 추상화 됨
	- 즉, 껍데기만 있다는 의미
	
	interface의 멤버
	- 필드는 모두 public static final 속성
	- 매서드는 모두 public abstract 속성
*/
public interface FlyAble {
	String type = "날개";
	
	void fly();
}
