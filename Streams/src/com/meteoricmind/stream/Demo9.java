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
		Stream<Integer> myStream3 = numsList.stream();// stream is instance number
		myStream3.forEach(System.out::println);
		System.out.println("------4-------");
		Stream<Integer> myStream4 = numsList.parallelStream();
		myStream4.forEach(System.out::println);
		System.out.println("------5-------");
		List<Integer> numList1 = Arrays.asList(11, 12, 13);
		List<Integer> numList2 = Arrays.asList(51, 52, 53);
		Stream<List<Integer>> myStream5 = Stream.of(numList1, numList2);
		myStream5.forEach(System.out::println);
		System.out.println("------6-------");
		List<String> nameList1 = Arrays.asList("Ram", "Mohan", "Lakshman");
		List<String> nameList2 = Arrays.asList("Sita", "Gita", "Rita");
		Stream<List<String>> listStream = Stream.of(nameList1, nameList2);
		listStream.forEach(System.out::println);

	}
}
