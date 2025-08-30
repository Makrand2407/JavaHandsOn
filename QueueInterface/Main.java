package com.pkg;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.offer("D");
		System.out.println(queue);//[A, B, C, D]
		System.out.println(queue.remove());//A
		System.out.println(queue);//[B, C, D]
		System.out.println(queue.element());//B
		System.out.println(queue);//[B, C, D]
		System.out.println(queue.poll());//B	
		System.out.println(queue); // [C, D]		
		System.out.println(queue.peek()); // C		
		System.out.println(queue); // [C, D]

		Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);
        System.out.println(priorityQueue); // [1, 3, 2]
        System.out.println(priorityQueue.poll()); // 1
        System.out.println(priorityQueue); // [2, 3]
        System.out.println(priorityQueue.peek()); // 2

	}
}
