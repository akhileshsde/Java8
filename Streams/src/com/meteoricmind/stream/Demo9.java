package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo9 {
	public static void main(String[] args) {
		System.out.println("-----1------");
		Stream<Integer> myStream1 = Stream.empty();
		myStream1.forEach(System.out::println);
		System.out.println("------2------");
		Stream<Integer> myStream2 = Stream.of(11, 12, 13);
		myStream2.forEach(System.out::println);
		System.out.println("-----3------");
		List<Integer> numsList = Arrays.asList(11, 12, 13, 14, 15);
		Stream<Integer> myStream3 = numsList.stream();//stream is instance number
		myStream3.forEach(System.out::println);
		System.out.println("------4-------");
		Stream<Integer> myStream4 = numsList.parallelStream();
		myStream4.forEach(System.out::println);

		
	}
}
