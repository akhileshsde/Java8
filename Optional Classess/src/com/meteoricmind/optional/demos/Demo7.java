package com.meteoricmind.optional.demos;

import java.util.Optional;

public class Demo7 {
	public static void main(String[] args) {

		// Case-1
		String str1 = null;
		Optional<String> myOpts1 = Optional.ofNullable(str1);
		// System.out.println("Optional Object-1 : " + myOpts1);
		Optional<String> myOpts2 = myOpts1.filter(input -> input.contains("Akhil"));
		System.out.println("Optional Object-2 : " + myOpts2);

		// Case-2
		String str2 = "Akhilesh";
		Optional<String> myOpts3 = Optional.ofNullable(str2);
		// System.out.println("Optional Object-3 : " + myOpts3);
		Optional<String> myOpts4 = myOpts3.filter(input -> input.contains("Akhil"));
		System.out.println("Optional Object-4 : " + myOpts4);

		// Case-3
		String str3 = "Hello Guys!!!";
		Optional<String> myOpts5 = Optional.ofNullable(str3);
//		System.out.println("Optional Object-5 : " + myOpts5);
		Optional<String> myOpts6 = myOpts5.filter(input -> input.contains("Akhil"));
		System.out.println("Optional Object-6 : " + myOpts6);
		
		System.out.println("-------------------");
		System.out.println("Done!!!");
	}
}
