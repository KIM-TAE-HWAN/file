package operator;

/*
 	현재 건물에 엘리베이터가 2대 존재한다
 	A는 7층, B는 9층에 머물러 있다
 	엘리베이터는 1층 ~ 15층까지 있다
 	현재 사용자의 위치에 따라서 가까운 엘리베이터를 호출한다
 	단, 거리가 같으면 A를 호출한다
 
 	ex) 현재 5층   -> A를 호출한다
 	ex)	현재 10층 -> B를 호출한다
 */
public class Quiz03 {
	public static void main(String[] args) {
		int A = 7 , B = 9;
		int cur = 5;
		
		int disA = A - cur;	//A = A - cur;
		int disB = B - cur; //B = B - cur;		
		
		disA = (disA < 0) ? -disA : disA;
		disA = (disB < 0) ? -disB : disB;
		
		System.out.println("A와의 거리 : " + disA);
		System.out.println("B와의 거리 : " + disB);
		
		char result = (disA < disB) ? 'A' : 'B';
		System.out.printf("가까운 %c를 호출합니다\n", result);
	}
}
/*
  1. 자동차의 바퀴 둘레를 구해서 타이어를 만들어 자동차에 장착을 원한다
  
  2 파이r
  	4.141592
  	
  	GIGO = 쓰레기를 입력하면 쓰레기가 출력된다
  	- 잘못된 결과를 입력으로 사용하면 잘못된 결과가 도출된다
  	- 프로그램이 잘 만들어져 있어도 부정확한 데이터가 입력되면 잘못된 결과를 얻게된다
  	- 즉, 입력값 겁증이 중요하다는 의미
 */