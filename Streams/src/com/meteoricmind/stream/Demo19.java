package com.meteoricmind.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo19 {
	public static void main(String[] args) {

		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5);
		long count = numsList.stream().filter(num -> num % 2 != 0).collect(Collectors.counting());
		System.out.println(count);
		System.out.println("--------------------------");
		long sumResult = numsList.stream().filter(num -> num % 2 != 0)
				.collect(Collectors.reducing(0, (num1, num2) -> num1 + num2));
		System.out.println(sumResult);

		System.out.println("--------------------------");
		long mulResult = numsList.stream()
				.filter(num -> num % 2 != 0)
				.collect(Collectors.reducing(1, (num1,num2)-> num1*num2));
				System.out.println(mulResult); 
				System.out.println("--------------------------");
				List<String> courseList = Arrays.asList("Java","SpringBoot","DevOps");
				String result = courseList.stream()
				.collect(Collectors.joining(" --- "));
				System.out.println(result); 

	}
}
