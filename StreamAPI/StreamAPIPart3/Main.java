package com.pkg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// Partitions Numbers in even and odd list
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Map<Boolean, List<Integer>> r1 = l1.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("Even Numbers : " + r1.get(true));
		System.out.println("Odd Numbers : " + r1.get(false));

		// Group a list of words by their length
		List<String> l2 = Arrays.asList("apple", "bat", "ball", "cat", "banana", "dog", "goat");
		Map<Integer, List<String>> r2 = l2.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(r2);

		// Count Occurrences of each element in list
		List<String> l3 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		Map<String, Long> r3 = l3.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(r3);

		// Find Most Frequent Character in String
		String s1 = "banana";
		Entry<Character, Long> r4 = s1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).orElseThrow();
		System.out.println(r4);
		
		

	}

}
