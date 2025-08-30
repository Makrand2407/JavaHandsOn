package com.pkg;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("A");
		deque.addLast("B");
		deque.addFirst("C");
		System.out.println(deque);//[C, A, B]
		
		deque.offerFirst("D");
		deque.offerLast("E");
		System.out.println(deque); // [D, C, A, B, E]
		
		System.out.println(deque.removeFirst()); // D
		System.out.println(deque.removeLast()); // E
		System.out.println(deque); // [C, A, B]

		System.out.println(deque.pollFirst()); // C
		System.out.println(deque.pollLast()); // B
		System.out.println(deque); // [A]

		System.out.println(deque.getFirst()); // A
		System.out.println(deque.getLast()); // A
		
		deque.addLast("F");
		deque.addFirst("G");
		System.out.println(deque); // [G, A, F]
		System.out.println(deque.peekFirst()); // G
		System.out.println(deque.peekLast()); // F
		System.out.println(deque); // [G, A, F]


	}
}
