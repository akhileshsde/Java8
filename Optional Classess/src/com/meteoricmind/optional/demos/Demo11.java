package com.meteoricmind.optional.demos;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Demo11 {
	public static void main(String[] args) {

		String str1 = "Akhilesh";
	
		Optional<String> myopts1= Optional.ofNullable(str1);
		System.out.println("1. "+myopts1);
		System.out.println("2. "+myopts1.orElse("Hello Guys")); 
		System.out.println("3. "+myopts1.orElseGet( () -> "Ok Guys"));
		System.out.println("4. "+myopts1.orElseThrow(NoSuchElementException::new)); 
		String str2 = null;
		Optional<String> myopts2= Optional.ofNullable(str2);
		System.out.println("4. "+myopts2);
		System.out.println("5. "+myopts2.orElse("Hello Guys")); 
		System.out.println("6. "+myopts2.orElseGet( () -> "Ok Guys"));
		System.out.println("7. "+myopts2.orElseThrow(NoSuchElementException::new)); 

		System.out.println("Done!!!");

	}
}
