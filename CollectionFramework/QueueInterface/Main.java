package com.pkg;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // Queue implemented using LinkedList (FIFO order)
        Queue<String> queue = new LinkedList<>();
        queue.add("A");   // add element at the end
        queue.add("B");
        queue.add("C");
        queue.offer("D"); // offer also adds element, returns false if fails
        System.out.println(queue); // [A, B, C, D]
        System.out.println(queue.remove()); // A
        System.out.println(queue);          // [B, C, D]
        System.out.println(queue.element()); // B
        System.out.println(queue);           // [B, C, D]
        System.out.println(queue.poll()); // B
        System.out.println(queue);        // [C, D]
        System.out.println(queue.peek()); // C
        System.out.println(queue);        // [C, D]

        // Queue implemented using PriorityQueue (ordered by natural order)
        Queue<Integer> priorityqueue = new PriorityQueue<>();
        priorityqueue.add(3);
        priorityqueue.add(1);
        priorityqueue.add(2);

        // Internally stored as a min-heap, so smallest element has priority
        System.out.println(priorityqueue);       // [1, 3, 2] (heap representation)
        System.out.println(priorityqueue.poll()); // removes and returns smallest → 1
        System.out.println(priorityqueue);       // [2, 3]
        System.out.println(priorityqueue.peek()); // retrieves smallest → 2
        System.out.println(priorityqueue);       // [2, 3]
    }
}
