package collection;

import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class Ex01 {
	public static void main(String[] args) {
		// 그 외 나머지 list를 구현한 클래스
		// Vector는 java 초기 버전에서 사용하던 클래스
		Vector<Integer> vec = new Vector<Integer>();
		
		vec.add(10);
		vec.add(30);
		
		System.out.println("vec : " + vec);
		
		
		// stack
		// - LIFO : 선입선출 , 나중에 들어간 데이터가 먼저 꺼내지는 구조
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("stack : " + stack);
		
		int n = stack.pop();
		
		System.out.println("\nn : " + n);
		System.out.println("stack : " + stack);
		
		// Queue
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println("\nqueue :" + queue);
		
		n = queue.poll();
		
		System.out.println("\nn : " + n);
		System.out.println("queue : " + queue);
		
	}
}
