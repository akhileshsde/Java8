package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {
	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(1, 2, 3);
		Stream<Integer> mystream1 = numsList.stream(); // 1
		mystream1.forEach(System.out::println); // 3
		// mystream1.forEach(System.out::println); //3 //Exception
		System.out.println("-------------");
		Stream<Integer> mystream2 = numsList.stream(); // 1
		mystream2.forEach(System.out::println); // 3
		System.out.println("-------------");
		Stream<Integer> mystream3 = numsList.stream(); // 1
		mystream3.forEach(System.out::println); // 3
	}
}