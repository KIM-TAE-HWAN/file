package collection;


//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/*
 	로또 추첨기
 	1. 1 ~ 45 사이의 숫자를 무작위로 뽑는다
 	2. 단, 중복없이 6개를 뽑아야한다
 	3. 결과는 항상 오름차순으로 출력
*/
class Lotto {
	static TreeSet<Integer> getNumber() {
		Random ran = new Random();
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while (lotto.size() != 6) {
			int n = ran.nextInt(45) + 1;
			lotto.add(n);
			// System.out.println("n :" + n);  // 디버깅
		}
		
		return lotto;
	}
}

public class Quiz01 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		System.out.print("로또 구매 개수? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			TreeSet<Integer> lotto = Lotto.getNumber();
			System.out.println(i + "번 로또)" + lotto);
			
			Thread.sleep(100);		// ()시간만큼 텀으로 출력
		}
		sc.close();
		
		
		
//		HashSet<Integer> se = new HashSet<Integer>();
//		
//		Comparator<Integer> desc;
//		desc = (Integer o1, Integer o2) -> {
//			return o1 - o2;
//		};
//		
//		TreeSet<Integer> set = new TreeSet<Integer>(desc);
//		
//		for (int i = 0; set.size() < 6; i++) {
//			int num = (int)(Math.random()*45) + 1;
//			set.add(num);
//		}
//		LinkedList<Integer> list = new LinkedList<Integer>(set);
//		Collections.sort(list);
//		
//		System.out.println("로또번호 : " + list);
	}
}
