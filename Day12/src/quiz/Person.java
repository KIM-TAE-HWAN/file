package quiz;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;				
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
	public void eat(String food) {
		System.out.printf("\n%s가 %s를 먹는다\n\n", name, food);
	}
	public void talkTo(Person tar) {
		System.out.printf("%s가 %s에게 대화를 건다", name, tar.name);
	}
}
