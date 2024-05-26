package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo16 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
		Optional<Integer> mycourse1 = numList.stream().findAny();
		mycourse1.ifPresent(System.out::println);
		System.out.println("-------------");
		Optional<Integer> mycourse2 = numList.stream().findFirst();
		mycourse2.ifPresent(System.out::println);
		System.out.println("-------------");
		Optional<Integer> mycourse3 = numList.stream().parallel().findAny();
		mycourse3.ifPresent(System.out::println);
		System.out.println("-------------");
		Optional<Integer> mycourse4 = numList.stream().parallel().findFirst();
		mycourse4.ifPresent(System.out::println);
		System.out.println("-------------");
		System.out.println("Done!!!");
	}
}
