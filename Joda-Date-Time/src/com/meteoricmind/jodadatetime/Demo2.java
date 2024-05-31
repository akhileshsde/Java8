package com.meteoricmind.jodadatetime;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo2 {
	public static void main(String[] args) {
		Month june = Month.JUNE;
		System.out.println("Month :" + june);
		System.out.println("Value :" + june.getValue());
		System.out.println("Max :" + june.maxLength());
		System.out.println("Min :" + june.minLength());
		Locale loc = Locale.getDefault();
		System.out.println("Full :" + june.getDisplayName(TextStyle.FULL, loc));
		System.out.println("Short :" + june.getDisplayName(TextStyle.SHORT, loc));
		System.out.println("Narrow :" + june.getDisplayName(TextStyle.NARROW, loc));
		System.out.println("--------------------------");
		System.out.println("-2 :" + june.minus(2));
		System.out.println("+2 :" + june.plus(2));
		System.out.println("N of Days:" + june.length(false));
		System.out.println("N of Days (Leap Y):" + june.length(true));
		System.out.println("--------------------------");
		System.out.println("\nDay of Year :" + Month.JANUARY.firstDayOfYear(false));
		System.out.println("Day of Year :" + Month.JANUARY.firstDayOfYear(true));
		System.out.println("\nDay of Year :" + Month.MARCH.firstDayOfYear(false));
		System.out.println("Day of Year :" + Month.MARCH.firstDayOfYear(true));
		System.out.println("\nMon of Quater :" + Month.JANUARY.firstMonthOfQuarter());
		System.out.println("Mon of Quater :" + Month.MAY.firstMonthOfQuarter());
		System.out.println("Mon of Quater :" + Month.SEPTEMBER.firstMonthOfQuarter());
		System.out.println("Mon of Quater :" + Month.DECEMBER.firstMonthOfQuarter());
	}
}
