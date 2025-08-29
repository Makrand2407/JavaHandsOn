package com.pkg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
    //HashSet
		Set <Integer> hs = new HashSet<>();
		hs.add(20);
		hs.add(3);
		hs.add(11);
		hs.add(4);
		hs.add(1);
		System.out.println(hs);//[1, 3, 20, 4, 11]
 
		LinkedHashSet <Integer> ls = new LinkedHashSet<>();
    //LinkedHashSet
		ls.add(20);
		ls.add(3);
		ls.add(11);
		ls.add(4);
		ls.add(1);
		System.out.println(ls);//[20, 3, 11, 4, 1]

		TreeSet <Integer> ts = new TreeSet<>();
    //TreeSet
		ts.add(20);
		ts.add(3);
		ts.add(11);
		ts.add(4);
		ts.add(1);
		System.out.println(ts);//[1, 3, 4, 11, 20]

	}
}
