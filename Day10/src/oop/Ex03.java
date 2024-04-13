package oop;

//class Person {
//		같은 패키지 간에는 클래스가 공유된다. 동일하게 못 만든다
//}

public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "김철수";
		p2.name = "박수진";
		
		p1.eat("라면");			// eat(p1, "라면")
		System.out.println();
		
		p2.eat("김밥");			// eat(p2, "김밥")
		
		// 즉, 매서드의 this는 매서들르 호출한 인스턴스를 구분하기 위함이다
	}
}
