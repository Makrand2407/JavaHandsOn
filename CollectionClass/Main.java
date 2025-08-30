package com.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(3);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(9);
		System.out.println(Collections.binarySearch(l1, 6));// 2

		List<String> l2 = new ArrayList<>();
		l2.add("One");
		l2.add("Two");
		l2.add("Three");

		List<String> l3 = new ArrayList<>();
		l3.add("Four");
		l3.add("Five");
		l3.add("Six");

		System.out.println(Collections.disjoint(l2, l3));// true

		Collections.copy(l3, l2);
		System.out.println(l2); // [one,two,three]
		System.out.println(l3); // [one,two,three]
		System.out.println(Collections.disjoint(l2, l3)); // false
		
		List l4 = Collections.nCopies(3, "Hello");
		System.out.println(l4);//[Hello, Hello, Hello]
		
		Set s1 = Collections.emptySet();
		System.out.println(s1);//[]
			
		Map m1 = Collections.emptyMap();
		System.out.println(m1);//{}
			
		List l5 = Collections.emptyList();
		System.out.println(l5);//[]

		System.out.println(Collections.frequency(l4, "Hello"));//3
		
		Collections.fill(l3, "Hi");
		System.out.println(l3);//[Hi, Hi, Hi]

		Collections.replaceAll(l3, "Hi", "He");
		System.out.println(l3);//[He, He, He]

		List <String> l6 = new ArrayList<>();
		l6.add("Hii");
		l6.add("Hi");
		l6.add("Hiii");
		l6.add("Hi Good Morning");
		Collections.replaceAll(l6,"Hi", "He");
		System.out.println(l6);//[Hii, He, Hiii, Hi Good Morning]

		List <Integer> l7 = new ArrayList<>();
		l7.add(8);
		l7.add(-20);
		l7.add(-8);
		l7.add(20);
		System.out.println(l7);//[8, -20, -8, 20]
		Collections.reverse(l7);
		System.out.println(l7);//[20, -8, -20, 8]
		System.out.println(Collections.max(l7));//20
		System.out.println(Collections.min(l7));//-20

		Collections.shuffle(l7);
		System.out.println(l7);//[-8, -20, 8, 20]
			
		Collections.sort(l7);
		System.out.println(l7);//[-20, -8, 8, 20]
			
		Collections.sort(l7, Comparator.reverseOrder());
		System.out.println(l7);//[20, 8, -8, -20]

		Collections.swap(l7, 0, 3);
		System.out.println(l7);//[-20, 8, -8, 20]
			
		l7 = Collections.singletonList(23);
		System.out.println(l7);//[23]
			
		List l8 = Collections.synchronizedList(l6);
		System.out.println(l8);//[Hii, He, Hiii, Hi Good Morning]
			
		List l9 = Collections.unmodifiableList(l2);
		System.out.println(l9);//[One, Two, Three]
		l9.add("four");
		System.out.println(l9);//Exception 

	}
}
