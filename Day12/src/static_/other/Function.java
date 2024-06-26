package static_.other;


public class Function {
	public static void printNumber(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static int total(int n) {
		int sum = 0;
		for(int i = 1 ; i < n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int absolute(int n) {
		if (n < 0) {
			return -n;
		}
		return n;
	}
	
	public static void selectSort(int arr[]) {
		int backup;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					backup = arr[i];
					arr[i] = arr[j];
					arr[j] = backup;
				}
			}
		}	
	}
	
//	public static boolean isPrime(int n) {
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				return false;
//			}
//		}
//		return false;
//	}
	
	public static boolean isPrime(int n) {
	for (int i = 2; i <= n / 2; i++) {
		if (n % i == 0) {
			return false;
		}
	}
	return true;
}
}
