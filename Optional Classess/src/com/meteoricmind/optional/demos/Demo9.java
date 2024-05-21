package com.meteoricmind.optional.demos;

import java.util.Optional;

public class Demo9 {
	public static void main(String[] args) {

		// map() method
		String str1 = "Akhilesh";
		Optional<Optional<String>> myopts1 = Optional.of(Optional.ofNullable(str1));
		System.out.println("1. " + myopts1);
		System.out.println("2. " + myopts1.map(input -> input));
		System.out.println("--------------------------------");
		// It will flatten one level
		Optional<Optional<String>> x = myopts1.map(input1 -> input1.map(input2 -> input2.toUpperCase()));
		System.out.println("X. " + x);

		Optional<String> y = myopts1.flatMap(input1 -> input1.map(input2 -> input2.toUpperCase()));
		System.out.println("Y. " + y);
		Optional<String> z = y.map(input2 -> input2.toUpperCase());
		System.out.println("Z. " + z);
		String value = z.get();
		System.out.println("Value :" + value);
		System.out.println("Done!!!");
	}
}
