package com.itbank.Day68;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex01Test {
	
	// 호출해서 사용할 메서드는 @test를 불르지 않는다
	private int total(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	
	@Test
	public void test1() {
//		System.out.println("Junit 코드 테스트");
		
		int result = total(10);		
//		System.out.println("result : " + result);
		
		assertEquals("total test", 55, result);
		// (메세지, 기대값, 결과값)
		// - 기대값과 결과값이 같으면 성공
		// - 다르면 failure가 발생

	}
	
}

