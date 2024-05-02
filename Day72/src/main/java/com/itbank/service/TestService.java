package com.itbank.service;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public void firstAOP() {
		// System.out.println("service 메서드 출력");
	}
	
	public int total(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
//	public int[] lotto() {
//		
//		Random random = new Random();
//		
//		int[] num = new int[6];
//		
//		for(int i = 0; i < 6; i++) {
//			int number = random.nextInt(45)*1;
//			for(int j = 0; j < i; j++) {
//				if(num[j] == number) {
//					number = random.nextInt(45) + 1;
//					j = -1;
//				}
//			}
//			num[i] = number;
//		}
//		
//		  System.out.println("이번주 로또 번호" );
//		  for(int number : num) {
//			  System.out.print("[" + number + "]");
//		}
//		
//		return num;
//	}
	
	public Set<Integer> lotto() {
		
		TreeSet<Integer> lotto = new TreeSet();
		Random ran = new Random();
		
		while(lotto.size() != 6 ) {
			lotto.add(ran.nextInt(45)+1);
		}
		
		return lotto;
	}
}
