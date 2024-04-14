package abstract_;

import java.util.Arrays;
import java.util.Comparator;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		}
		
		@Override
		public String toString() {
			return name + " " + age + "세";
		}
		
		int getAge() {
			return age;
		}
		
		String getName() {
			return name;
		}
}

public class Quiz01 {
	public static void main(String[] args) {
		// 1. 실수형 배열을 생성 후 내림 차순 정렬
		Double[] arr1 = new Double[] {1.31, 2.22, 3.14};
		
		Comparator<Double> desc = (Double o1, Double o2) -> {
				// return (int) (o2 - o1);
			return o2.compareTo(o1);
		};
		
		Arrays.sort(arr1 , desc);
		System.out.println("arr1 : " + Arrays.toString(arr1));	
		
		
		// 2. 문자열 배열을 생성 후 오름 차순 정렬
		String[] arr2 = new String[] {"Banana", "Apple", "WaterMelon"};
		
		Comparator<String> asc = (String o1, String o2) -> {
			return o1.compareTo(o2);
		};
		
		Arrays.sort(arr2, asc);
		System.out.println("arr2 : " + Arrays.toString(arr2));	
		
		
		// 3. Person 클래스를 생성 후 나이순으로 내림 차순
		// 필드는 이름, 나이만 가진다
		Person[] arr3 = new Person[] {
			new Person("김철수", 23),
			new Person("이수진", 27),
			new Person("박민수", 29)
		};
	
		Comparator<Person> ageDesc = (Person o1, Person o2) -> {
			return o2.age - o1.age;
		};
		
		Arrays.sort(arr3, ageDesc);
		System.out.println("arr3 : " + Arrays.toString(arr3));
	 // System.out.println("arr[0] : " + arr3[0].toString());
		
		// 4. Person 클래스를 생성 후 이름순으로 내림 차순
		Comparator<Person> ageDesc1 = (Person o1, Person o2) -> {
			String name1 = o1.getName();
			String name2 = o2.getName();
			
			return name2.compareTo(name1);
		};
	}	
}
