package com.meteoricmind.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(10, 20, 30);
		List<List<Integer>> mylist = Arrays.asList(list1, list2);
		mylist.stream().forEach(System.out::println);
		System.out.println("---------------------");
		mylist.stream().map(Collection::stream).forEach(System.out::println);
		System.out.println("---------------------");
		mylist.stream().map(Collection::stream).flatMap(input -> input).forEach(System.out::println);
	}
}