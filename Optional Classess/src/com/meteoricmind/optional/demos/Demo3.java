package com.meteoricmind.optional.demos;

import java.util.Optional;

public class Demo3 {
	public static void main(String[] args) {
		// Optional.of() with null
		String str = null;
		Optional<String> myopts = Optional.of(str);
		System.out.println(myopts);
	}
}