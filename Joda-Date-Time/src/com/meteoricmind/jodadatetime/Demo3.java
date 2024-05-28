package com.meteoricmind.jodadatetime;

import java.time.LocalDate;

public class Demo3 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, 2, 5);
		System.out.println("YEAR :" + date.getYear());
		System.out.println("MONTH :" + date.getMonth());
		System.out.println("MONTH VALUE :" + date.getMonthValue());
		System.out.println("DATE :" + date.getDayOfMonth());
		System.out.println("DAYOF WEEK :" + date.getDayOfWeek());
		System.out.println("DAYOF WEEK VALUE :" + date.getDayOfWeek().getValue());
		System.out.println("DAY OF YEAR :" + date.getDayOfYear());
		System.out.println("Month Len :" + date.lengthOfMonth());
		System.out.println("Year Len :" + date.lengthOfYear());
		LocalDate date1 = LocalDate.now();
		System.out.println("\nYEAR :" + date1.getYear());
		System.out.println("MONTH :" + date1.getMonth());
		System.out.println("MONTH VALUE :" + date1.getMonthValue());
		System.out.println("DATE :" + date1.getDayOfMonth());
		System.out.println("DAYOF WEEK :" + date1.getDayOfWeek());
		System.out.println("DAYOF WEEK VALUE :" + date1.getDayOfWeek().getValue());
		System.out.println("DAY OF YEAR :" + date1.getDayOfYear());
		System.out.println("Month Len :" + date1.lengthOfMonth());
		System.out.println("Year Len :" + date1.lengthOfYear());

	}
}
