package other;

public abstract class Animal {
	public void eat(String food) {
		// 일반 매서드
		System.out.println(food + "(을)를 먹는다");
	}
	
		// 추상 매서드
		public abstract void bark();
}
