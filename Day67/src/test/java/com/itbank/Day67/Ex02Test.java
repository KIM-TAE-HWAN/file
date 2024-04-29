package com.itbank.Day67;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Ex02Test {
	
	private static int share;	// 계속해서 누적됨
	private int num;
	
	@BeforeClass			// 테스트 클래스(Ex02Test)가 수행시 딱 한번만
	public static void setShare() {
		System.out.println("beforeclass 수행");
		share = 10;
	}
	
	@Before					// @test 들마다 먼저 수행되는 코드
	public void setNum() {
		System.out.println("\nbefore 수정");
		num = 10;
	}
	
	@Test
	public void run1() {
		System.out.println("run1 수정");
		
		num += 2;
		share -= 2;
		System.out.println("run1의 num : " + num);
		System.out.println("run1의 share : " + share);
	}
	
	@Test
	public void run2() {
		System.out.println("run2 수정");
		
		num += 2;
		share -= 2;
		System.out.println("run2의 num : " + num);
		System.out.println("run2의 share : " + share);
	}
	
	@After						// @test들 마다 끝난 후 수행되는 코드
	public void resultNum() {
		System.out.println("after 수정");
		
		System.out.println("num : " + num);
		System.out.println("share : " + share);
	}
	
	@AfterClass
	public static void resultShare() {
		System.out.println("\nafterclass 수행");
	}
}
