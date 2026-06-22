package com.pkg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // ===== ArrayList Example =====
        ArrayList l1 = new ArrayList<>();
        System.out.println(l1.size()); // Initially empty → 0
        l1.add("A");
        l1.add("B");
        l1.add(10); // Mixing types (String + Integer)
        l1.add(20);
        System.out.println(l1.size()); // Now 4
        System.out.println(l1); // [A, B, 10, 20]

        ArrayList l2 = new ArrayList<>();
        System.out.println(l2.size()); // 0
        l2.addAll(l1); // Copy all elements from l1
        System.out.println(l2); // [A, B, 10, 20]
        System.out.println(l1.contains(3)); // false
        System.out.println(l1.contains(10)); // true
        System.out.println(l1.containsAll(l2)); // true
        System.out.println(l1.indexOf(10)); // 2

        // ===== retainAll Example =====
        List l3 = new ArrayList<>();
        l3.add("A");
        l3.add("B");
        l3.add(1);
        l3.add(2);
        l3.add(3);

        List l4 = new ArrayList<>();
        l4.add("A");
        l4.add("B");
        l4.add(1);

        l3.retainAll(l4); // Keep only common elements
        System.out.println(l3); // [A, B, 1]
        System.out.println(l4); // [A, B, 1]

        String s1 = (String) l3.get(0); // Type casting required
        System.out.println(s1); // A

        // ===== Generics with ArrayList =====
        List<String> l5 = new ArrayList<>();
        System.out.println(l5.size()); // 0
        l5.add("C");
        l5.add("F");
        l5.add(1, "O"); // Insert at index 1
        l5.add("T");
        l5.add("R");
        System.out.println(l5.size()); // 5
        System.out.println(l5); // [C, O, F, T, R]
        String s2 = l5.get(0); // No cast needed with generics
        System.out.println(s2); // C
        System.out.println(l5.contains("S")); // false

        List<String> l6 = new ArrayList<>();
        l6.add("C");
        l6.add("F");
        System.out.println(l5.containsAll(l6)); // true
        System.out.println(l5.contains("S")); // false
        l5.remove("F"); // Remove by value
        l5.remove(2);   // Remove by index
        System.out.println(l5); // [C, O, R]

        // ===== LinkedList Example =====
        LinkedList<Integer> l7 = new LinkedList<>();
        l7.add(3);
        l7.add(5);
        l7.add(2);
        l7.add(1, 7); // Insert at index 1
        l7.addFirst(8);
        l7.addLast(9);
        System.out.println(l7.size()); // 6
        System.out.println(l7); // [8, 3, 7, 5, 2, 9]
        System.out.println(l7.get(5)); // 9
        System.out.println(l7.getFirst()); // 8
        System.out.println(l7.getLast()); // 9

        l7.remove(1); // Remove element at index 1
        l7.removeFirst(); // Remove first element
        l7.removeLast(); // Remove last element
        System.out.println(l7); // [7, 5, 2]
        System.out.println(l7.peekFirst()); // 7 (does not remove)
        System.out.println(l7); // [7, 5, 2]
        System.out.println(l7.pollLast()); // 2 (removes last)
        System.out.println(l7); // [7, 5]

        // ===== Vector Example =====
        Vector<Integer> v = new Vector<>(3, 2); // Initial capacity 3, grows by 2
        System.out.println(v.size()); // 0
        System.out.println(v.capacity()); // 3
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4); // Capacity increases
        System.out.println(v); // [1, 2, 3, 4]
        System.out.println(v.size()); // 4
        System.out.println(v.capacity()); // 5

        v.add(5);
        v.add(6);
        System.out.println(v.size()); // 6
        System.out.println(v.capacity()); // 7
        System.out.println(v); // [1, 2, 3, 4, 5, 6]

        // ===== Stack Example =====
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.size()); // 3
        System.out.println(stack); // [A, B, C]
        System.out.println(stack.pop()); // Removes & returns C
        System.out.println(stack); // [A, B]
        System.out.println(stack.peek()); // B (top element)
        System.out.println(stack); // [A, B]

        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.search("A")); // Position from top → 2
        System.out.println(stack.search("B")); // 1
        System.out.println(stack.search("C")); // -1 (not found)

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2); // [1, 2, 3]
        System.out.println(stack2.peek()); // 3
        System.out.println(stack2); // [1, 2, 3]
        System.out.println(stack2.pop()); // 3
        System.out.println(stack2); // [1, 2]
    }
}
