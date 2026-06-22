package com.pkg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // HashSet: Unordered collection, no duplicates, allows one null
        Set<Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(3);
        hs.add(11);
        hs.add(4);
        hs.add(1);
        System.out.println(hs); // Output order is unpredictable

        // LinkedHashSet: Maintains insertion order, no duplicates
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(20);
        ls.add(3);
        ls.add(11);
        ls.add(4);
        ls.add(1);
        System.out.println(ls); // [20, 3, 11, 4, 1]

        // TreeSet: Stores elements in sorted order, no duplicates, no nulls
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(3);
        ts.add(11);
        ts.add(4);
        ts.add(1);
        System.out.println(ts); // [1, 3, 4, 11, 20]

        // Using SortedSet reference: range views and ordering
        SortedSet<Integer> sorted = ts;
        System.out.println("SortedSet first: " + sorted.first());   // 1
        System.out.println("SortedSet last: " + sorted.last());     // 20
        System.out.println("SortedSet headSet(11): " + sorted.headSet(11)); // [1, 3, 4]
        System.out.println("SortedSet tailSet(4): " + sorted.tailSet(4));   // [4, 11, 20]
        System.out.println("SortedSet subSet(3, 20): " + sorted.subSet(3, 20)); // [3, 4, 11]

        // Using NavigableSet reference: advanced navigation methods
        NavigableSet<Integer> nav = ts;
        System.out.println("NavigableSet lower(11): " + nav.lower(11));   // 4
        System.out.println("NavigableSet floor(11): " + nav.floor(11));   // 11
        System.out.println("NavigableSet higher(11): " + nav.higher(11)); // 20
        System.out.println("NavigableSet ceiling(11): " + nav.ceiling(11)); // 11
        System.out.println("NavigableSet pollFirst(): " + nav.pollFirst()); // removes 1
        System.out.println("NavigableSet pollLast(): " + nav.pollLast());   // removes 20
        System.out.println("NavigableSet descendingSet(): " + nav.descendingSet()); // [11, 4, 3]
    }
}
