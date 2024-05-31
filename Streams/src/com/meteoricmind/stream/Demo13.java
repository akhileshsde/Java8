package com.meteoricmind.stream;

import java.util.Random;
import java.util.stream.Stream;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind private Limited
* */
public class Demo13 {
	public static void main(String[] args) {

		
		Stream<Integer> myStream = Stream.generate(() -> (new Random()).nextInt(100));
		myStream.limit(10).forEach(System.out::println);
		System.out.println("---------------------------------");
		Stream.generate(() -> (new Random()).nextInt(100)).limit(10).filter(num -> num % 2 == 0)
				.forEach(System.out::println);
		System.out.println("---------------------------------");
		Stream.generate(() -> (new Random()).nextInt(100)).limit(10).filter(num -> num % 2 != 0)
				.forEach(System.out::println);
		System.out.println("---------------------------------");
		Stream.generate(() -> (new Random()).nextInt(10)).limit(10).filter(num -> num % 2 != 0).map(num->num*num)
				.forEach(System.out::println);
		System.out.println("---------------------------------");
		Stream.generate(() -> (new Random()).nextInt(10)).limit(10).filter(num -> num % 2 == 0).map(num->num*num)
				.forEach(System.out::println);
	}
}
