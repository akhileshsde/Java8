package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
	public static void main(String[] args) {

		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(numsList);
		System.out.println("--------------------");
		//Multiple line explanation for better understanding
		Stream<Integer> myStream = numsList.stream();
		Stream<Integer> oddStream = myStream.filter(num -> num % 2 != 0);
		Stream<Integer> squareStream = oddStream.map(num -> num * num);
		squareStream.forEach(System.out::println);
		System.out.println("--------------------");
//we can process in one line
		numsList.stream().filter(num -> num % 2 == 0).map(num -> num * num).forEach(System.out::println);
		System.out.println(numsList);
	}
}
