package com.pkg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//Find all Distinct elements from list
		List<Integer> l1 = Arrays.asList(5,2,8,2,3,5,9,3);
		List<Integer> r1 = l1.stream().distinct().toList();
		System.out.println(r1);
		
		//Find the average of all numbers in a list
		List<Integer> l2 = Arrays.asList(5,10,15,20,25);
		double average = l2.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(average);
		
		//Sort List of Integers In ASC/DESC Order Using Streams
		List<Integer> l3 = Arrays.asList(5,1,8,3,2,10);
		List<Integer> asc = l3.stream().sorted().toList();
		List<Integer> desc = l3.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(asc);
		System.out.println(desc);
		
		//Count How Many Strings Start with Specific Letter(Like 'A')
		List<String> l4 = Arrays.asList("Apple","Banana","Avocado","Mango","Apricot");
		long count = l4.stream().filter(e -> e.startsWith("A")).count();
		System.out.println(count);
		
		//Join all strings in list into single comma-separated string
		List<String> l5 = Arrays.asList("Apple","Banana","Mango","Orange");
		String r2 = l5.stream().collect(Collectors.joining(","));
		System.out.println(r2);
		
		//Check if all elements are positive numbers
		List<Integer> l6 = Arrays.asList(5,10,8,3,2);
		boolean r3 = l6.stream().allMatch(e -> e>0);
		System.out.println(r3);
		
		//Check if any number is divisible by 3
		List<Integer> l7 = Arrays.asList(5,7,9,10,14);
		boolean r4 = l7.stream().anyMatch(e -> e%3==0);
		System.out.println(r4);
		
		//Flatten the list of list
		List<List<Integer>> l8 = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5),Arrays.asList(6,7,8));
		List<Integer> r5 = l8.stream().flatMap(List::stream).toList();
		System.out.println(r5);
		
		//Find the first non-empty string in a list
		List<String> l9 = Arrays.asList("","","Hello","World","");
		Optional<String> r6 = l9.stream().filter(s -> !s.isEmpty()).findFirst();
		System.out.println(r6.get());
		
		//Find Second Highest Number in list
		List<Integer> l10 = Arrays.asList(5,9,10,2,8,14,1);
		Optional<Integer> second = l10.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(second.get());
		
	}

}

