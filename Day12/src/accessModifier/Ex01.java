package accessModifier;

import other.Person;

public class Ex01 {
	public static void main(String[] args) {
		Person per = new Person("홍길동" , 34);
		
		// GETTER와 SETTER 꼭 둘다 구현할 필요없다
		// - 필용시 GET 혹은 SET만 만들어 사용하기도 한다
		per.setName("홍진경");
		System.out.println("per 이름 : " + per.getName());
		
		per.setAge(44);
		System.out.println("per 나이 : " + per.getAge());
	}
}
