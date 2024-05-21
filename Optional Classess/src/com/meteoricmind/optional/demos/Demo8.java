package com.meteoricmind.optional.demos;

import java.util.Optional;

public class Demo8 {
	public static void main(String[] args) {

		// map() method
		String str1 = "Akhilesh";
		Optional<String> myopts1 = Optional.ofNullable(str1);
		System.out.println("1. " + myopts1);

		Optional<String> myopts2 = myopts1.map(input -> input);
		System.out.println("2. " + myopts2);

		Optional<String> myopts3 = myopts1.map(input -> input.toUpperCase());
		System.out.println("3. " + myopts3);

		Optional<String> myopts4 = myopts3.map(input -> new StringBuilder(input).reverse().toString());
		System.out.println("4. " + myopts4);

		String mystr = null;
		Optional<String> myopts = Optional.ofNullable(mystr);
		System.out.println("5. " + myopts);

		Optional<String> myopts5 = myopts.map(input -> input.toUpperCase());
		System.out.println("6. " + myopts5);
		System.out.println("Done!!!");
	}
}
