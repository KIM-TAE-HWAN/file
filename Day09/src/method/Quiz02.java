package method;

import java.util.Arrays;
import java.util.Random;

/*
 	1. 60,000개 크기의 정수형 배열을 생성 후 랜덤으로 값을 채운다
 	단, 범위는 1 ~ 120,000
 	
 	2. 삽입 정렬을 구한 후 소요시간을 출력
 	단, 오름/내림차순 관계없이 아무거나
 */
public class Quiz02 {
	
	static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {			//arr.length : 개수
			for (int j = 0; j < i; j++) {	
				if(arr[j] > arr[i]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[60000];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(120000)+1;		
		}	

		long start = System.currentTimeMillis();
		
		insertSort(arr);
		
		long end = System.currentTimeMillis();
		
//		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("소요 시간 = " + (end - start / 1000.0));
	} 
	
}
