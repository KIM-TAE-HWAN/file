package varialble;

public class Quiz {
	public static void main(String[] args) {
		// 1. 학생의 이름, 국영수 점수를 저장할 변수를 선언
		// 단, 국영수는 정수 타입으로
		
		// 2. 1번의 변수에 값을 채운 후 아래와 같이 출력
		//
		// 결과)
		// 이름 : 김민지
		// 성적 : 국(92), 영(88), 수(95)
		String name = "김민지";
		int kor = 92;
		int eng = 88;
		int mat = 95;
		// int kor=92, eng=88, mat=95도 가능
		
		System.out.printf("이름 : %s\n", name); //System.out.println("이름 : ", name); 도 가능
		System.out.printf("성적 : 국(%d), 영(%d), 수(%d)",kor,eng,mat);
		
	}
}
