package com.meteoricmind.stream;

import java.util.*;
import java.util.stream.Collectors;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind private Limited
* */
public class Demo17 {
	public static void main(String[] args) {

		List<Integer> numsList = Arrays.asList(5, 4, 8, 3, 6, 7, 2, 9);
		List<Integer> mylist1 = numsList
				.stream()
				.filter(num -> num % 2 == 0)
				.map(num -> num * num)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(mylist1);
		System.out.println("-------------");
		
		List<Integer> mylist2 = numsList
				.stream()
				.filter(num -> num % 2 == 0)
				.map(num -> num * num)
				.sorted()
				.collect(Collectors.toCollection(LinkedList::new));

		System.out.println(mylist2);
		System.out.println("-------------");
		System.out.println("Done!!!"); 


	}
}
