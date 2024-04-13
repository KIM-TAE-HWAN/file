package loop;
/*
	1. 1 ~ 1000까지의 합계를 출력
	2. 1 ~ 1000까지의 합계를 출력
		단, 3의 배수는 합에서 제외
	3. 1 ~ 1000까지의 합계를 출력
		단, 3의 배수는 합에서 제외. 3,5의 공배수는 합에 포함
 */
public class Quiz04 {
	public static void main(String[] args) {
//		1)		
//		int sum = 0;
//		for(int i =1; i <=1000; i++) {
//			sum += i;
			
			// 디버깅
			//System.out.printf("i = d%, sum = %d\n", i , sum);
//		}
		
//		System.out.println("1 ~ 1000까지의 합 : " + sum);

//		2)
//		int sum = 0;
//		for(int i =1; i <=1000; i++) {
			
//			if (i % 3 == 0) {
//				continue;
//		}
//			sum += i;
			
			// 디버깅
			// System.out.printf("i = d%, sum = %d\n", i , sum);			
//		}
//		System.out.println("1 ~ 1000까지의 합(3의 배수 제외): " + sum);
		
//		3)
		int sum = 0;
		
		for(int i =1; i <=1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				// 여기는 빈 구문으로도 의미 있다				
		}
		else if (i % 3 == 0) {
			continue;
		}
			
			sum += i;
			//디버깅
			// System.out.printf("i = d%, sum = %d\n", i , sum);		
		}
		System.out.println("1 ~ 1000까지의 합(3의 배수 제외, 3과 5의 공배수는 포함): " + sum);
	}
}
