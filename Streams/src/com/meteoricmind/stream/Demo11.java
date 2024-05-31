package com.meteoricmind.stream;


import java.util.stream.Stream;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind private Limited
* */
public class Demo11 {
	public static void main(String[] args) {
		Stream<Integer> myStream = Stream.iterate(11, input -> input + 1);
		myStream.limit(10).forEach(System.out::println);
		System.out.println("---------------------------------");
		Stream.iterate(11, input -> input + 1).limit(10).filter(num->num%2==0).forEach(System.out::println);
		System.out.println("---------------------------------");
		Stream.iterate(11, input -> input + 1).limit(10).filter(num->num%2!=0).forEach(System.out::println);
	}
}
