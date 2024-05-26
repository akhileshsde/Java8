package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.List;


public class Demo14 {
	public static void main(String[] args) {

		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5);
		int sumResult1 = numsList.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sumResult1);
		System.out.println("-------------------"); 
		
		int sumResult2 = numsList.stream().reduce(0, Integer::sum);
		System.out.println(sumResult2);
		System.out.println("-------------------"); 
		
		
		int mulResult = numsList.stream().reduce(1, (a, b) -> a * b);
		System.out.println(mulResult);
		System.out.println("-------------------"); 

		Integer lastElement = numsList.stream()
				.reduce((num1, num2) -> num2)
				.orElse(-1);
				System.out.println(lastElement); 
	}
}
