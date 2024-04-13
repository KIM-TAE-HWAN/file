package oop;

class Student {
	String name;
	int kor , eng , mat;
	double avg;
	
	void showInfo() {			// student this, this = minsu
		String msg = "이름 : %s, (국 : %d, 영 : %d, 수 : %d)\n";
		System.out.printf(msg, name, kor, eng, mat);
	}
	
	int total() {		// total = this.total
		return kor + eng + mat;
	}
	
	double avg() {		// avg = this.avg
		return (kor + eng + mat) / 3.0;
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 작성하세요
		Student minsu = new Student();
		
		minsu.name = "김민수";
		minsu.kor = 70;
		minsu.eng = 80;
		minsu.mat = 98;
		
		minsu.showInfo();	// 이름 : 김민수 (국 70, 영 80, 수 98)
		
		System.out.println("합계 : " + minsu.total());
		System.out.println("평균 : " + minsu.avg());
	}
}
