package com.itbank.Day67;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class Ex03Test {
	
	private int[] arr1, arr2;
	private String str1, str2;
	
	@Before
	public void setVariable() {
		arr1 = new int[] { 10,20,30 };
		arr2 = new int[] { 10,20,30 };
		
		str1 = "hello";
		str2 = new String("hello");
	}
	
	@Test
	public void run1() {
		assertArrayEquals(arr1, arr2);		// 동일한 배열이면 성공
		System.out.println("실행완료");		// 다른 배열이면 failure 발생
	}
	
	@Test
	public void run2() {
		assertNotEquals(str1, str2);		// 두 객체의 데이터가 다르면 성공 - 같아서 실패 뜸
		System.out.println("실행?");			// 실패가 발생하면 남은 코드는 수행되지 않는다
	}
	
}
