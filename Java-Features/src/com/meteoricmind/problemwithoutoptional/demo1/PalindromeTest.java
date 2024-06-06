package com.meteoricmind.problemwithoutoptional.demo1;

import java.util.stream.IntStream;

public class PalindromeTest {
	 public static void main(String[] args) {
	  System.out.println(" Is Palindrome No : " + isPalindromeNumberByJava8(16461));
	 }

	 private static boolean isPalindromeNumberByJava8(int n) {
	  String value = String.valueOf(n);
	  int len = value.length();
	  boolean isPalindromeNumber = IntStream.range(0, len / 2)
	    .anyMatch(index -> value.charAt(index) == value.charAt(len - index - 1));
	  return isPalindromeNumber;
	 }
	}