package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo10 {
	public static void main(String[] args) {
		Stream<Integer> myStream1 = Stream.of(11, 12, 13);
		List<Integer> numsList = Arrays.asList(21, 22, 23);
		Stream<Integer> myStream2 = numsList.stream();
		Stream<Integer> myStream3 = Stream.concat(myStream2, myStream1);
		myStream3.forEach(System.out::println);
	}
}
