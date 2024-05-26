package com.meteoricmind.stream;


import java.util.stream.Stream;

public class Demo12 {
	public static void main(String[] args) {
	
		Stream.iterate(101, input -> input + 1).skip(25).limit(10).filter(num->num%2==0).forEach(System.out::println);
		System.out.println("---------------------------------");
		Stream.iterate(101, input -> input + 1).skip(25).limit(10).filter(num->num%2!=0).forEach(System.out::println);		
	}
}
