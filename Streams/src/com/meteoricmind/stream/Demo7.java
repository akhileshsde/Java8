package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.List;

public class Demo7 {
	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("---------------------");
		mylist.stream() // 1
				.skip(3).limit(5).peek(System.out::println).filter(num -> num % 2 != 0).peek(System.out::println)
				.map(num -> num * num).forEach(System.out::println); // 3
	}
}
