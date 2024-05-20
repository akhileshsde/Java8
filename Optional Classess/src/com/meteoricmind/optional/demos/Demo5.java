package com.meteoricmind.optional.demos;

import java.util.Optional;

public class Demo5 {
	public static void main(String[] args) {
		// Optional. ofNullable() method
		String str = "Srinivas";
		Optional<String> myopts = Optional.ofNullable(str);
		System.out.println("1. " + myopts);
		System.out.println("2. " + myopts.orElse("Hello Guys"));
		System.out.println("3. " + myopts);
		System.out.println("4. " + myopts.isPresent());
		if (myopts.isPresent()) {
			System.out.println("5. " + myopts.get());
		} else {
			System.out.println("6. No value Found");
		}
	}
}
