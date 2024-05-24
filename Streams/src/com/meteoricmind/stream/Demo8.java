package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.List;

public class Demo8 {
	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(5, 2, 7, 5, 8, 3, 9, 9, 4, 2, 3, 7, 1, 6, 1);
		mylist.stream().limit(15).filter(num -> num % 2 != 0).map(num -> num * num).sorted()
				.forEach(System.out::println);
		System.out.println("---------------------");
		mylist.stream().limit(15).distinct().filter(num -> num % 2 != 0).map(num -> num * num).sorted()
				.forEach(System.out::println);
	}
}
