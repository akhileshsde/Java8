package com.meteoricmind.jodadatetime;

import java.time.LocalDate;

public class Demo1 {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate myDate1 = LocalDate.parse("2021-01-01");
		System.out.println(myDate1);
		LocalDate myDate2 = LocalDate.of(2021,8,22);
		System.out.println(myDate2);
	}

}
