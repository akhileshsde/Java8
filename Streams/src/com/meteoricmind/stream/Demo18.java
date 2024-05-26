package com.meteoricmind.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo18 {
	public static void main(String[] args) {

		List<Integer> numsList = Arrays.asList(5, 4, 8, 3, 6, 7, 2, 9);
		System.out.println("-------------");
		Set<Integer> myset1 = numsList.stream()
				.filter(num -> num % 2 == 0)
				.map(num -> num * num)
				.sorted()
				.collect(Collectors.toSet());
		System.out.println(myset1);
		System.out.println("-------------"); 
		Set<Integer> myset2 = numsList.stream()
				.filter(num -> num % 2 == 0)
				.map(num -> num * num)
				.sorted()
				.collect(Collectors.toCollection(TreeSet::new));
				System.out.println(myset2);
				System.out.println("-------------");
				System.out.println("Done!!!"); 


	}
}
