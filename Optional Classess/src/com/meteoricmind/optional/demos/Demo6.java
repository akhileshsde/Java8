package com.meteoricmind.optional.demos;

import java.util.Optional;

public class Demo6 {//
	public static void main(String[] args) {
		// Is Present v/s IfPresent
		String str = null;
		// String str = "Srinivas";
		Optional<String> myopts = Optional.ofNullable(str);

		if (myopts.isPresent()) {
			System.out.println(myopts.get());
		}

		myopts.ifPresent(input -> System.out.println(input));
		if (myopts.isPresent())

			System.out.println(myopts.get().toUpperCase());
		myopts.ifPresent(input -> System.out.println(input.toUpperCase()));
		System.out.println("-------------------");
		System.out.println("Done!!!");
	}
}
