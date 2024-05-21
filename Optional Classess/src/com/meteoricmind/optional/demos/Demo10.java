package com.meteoricmind.optional.demos;

import java.util.Optional;

public class Demo10 {
	public static void main(String[] args) {

		String str = "Akhilesh";

		Optional<Optional<Optional<String>>> myOpts = Optional.of(Optional.of(Optional.ofNullable(str)));
		System.out.println("1. " + myOpts);

		Optional<Optional<Optional<String>>> aa = myOpts
				.map(input1 -> input1.map(input2 -> input2.map(input3 -> input3.toUpperCase())));
		System.out.println("2 :" + aa);

		Optional<Optional<String>> bb = myOpts
				.flatMap(input1 -> input1.map(input2 -> input2.map(input3 -> input3.toUpperCase())));
		System.out.println("3 :" + bb);

		Optional<String> cc = myOpts
				.flatMap(input1 -> input1.flatMap(input2 -> input2.map(input3 -> input3.toUpperCase())));
		System.out.println("4 :" + cc);

		String value = myOpts.flatMap(input1 -> input1.flatMap(input2 -> input2.map(input3 -> input3.toUpperCase())))
				.get();
		System.out.println("Value :" + value);

		System.out.println("Done!!!");

	}
}
