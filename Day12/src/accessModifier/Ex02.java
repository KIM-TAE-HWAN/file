package accessModifier;

import other.Animal;

// public 클래스는 import로 불러와서 언제든 사용 가능

// package 클래스는 import 불가능
// import other.Car;

public class Ex02 {
	public static void main(String[] args) {
		Animal an = new Animal();
		
		System.out.println("an : " + an);
		
	}
}
