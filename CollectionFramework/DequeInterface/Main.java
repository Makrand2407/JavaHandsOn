package com.pkg;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        // Deque implemented using ArrayDeque (double-ended queue)
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A"); //  A
        deque.addLast("B");  //  B
        deque.addFirst("C"); //  C
        System.out.println(deque); // [C, A, B]

        deque.offerFirst("D"); //  D
        deque.offerLast("E");  //  E
        System.out.println(deque); // [D, C, A, B, E]

        System.out.println(deque.removeFirst()); // D
        System.out.println(deque.removeLast());  // E
        System.out.println(deque); // [C, A, B]

        System.out.println(deque.pollFirst()); // C
        System.out.println(deque.pollLast());  // B
        System.out.println(deque); // [A]

        System.out.println(deque.getFirst()); // A
        System.out.println(deque.getLast());  // A

        deque.addLast("F");   // F
        deque.addFirst("G");  // G
        System.out.println(deque); // [G, A, F]

        System.out.println(deque.peekFirst()); // G
        System.out.println(deque.peekLast());  // F
        System.out.println(deque); // [G, A, F]
    }
}
