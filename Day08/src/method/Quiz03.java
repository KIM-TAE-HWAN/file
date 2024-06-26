package method;

import java.util.Random;

/*
※ main의 배열을 활용해서 아래 문제를 풀어주세요
1. 배열에 1 ~ 50사이의 정수를 랜덤으로 채운다

2. 배열의 모든 요소를 문자열로 반환하는 매서드

*/

public class Quiz03 {
	
	static void inputArr(int[] arr) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(50)+1;
		}
	}	
	static String printArr(int[] arr) {
		String result = "[";
		int i;
		
		for ( i = 0; i < arr.length - 1; i++) {
			result = result + arr[i] + ", ";
		}
		
		result += arr[i] + "]";
		
		return result;
	}
	static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		inputArr(arr);
		
		System.out.println("arr = " + printArr(arr));
		
		// 선택 정렬
		// - 앞의 데이터와 나머지 뒷 데이터를 비교하며 정렬
		// - i : 가장 처음에서 마지막 전까지
		// - j : i 다음 위치에서 마지막 까지
		// - 오름 차순 : 앞(i)이 데이터가 크면 교체
		
		selectSort(arr);
		
		System.out.println("arr = " + printArr(arr));

	}
}
