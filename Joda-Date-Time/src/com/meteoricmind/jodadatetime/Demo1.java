package com.meteoricmind.jodadatetime;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Demo1 {

	public static void main(String[] args) {
			DayOfWeek monday = DayOfWeek.MONDAY;
			System.out.println("Day " + monday);
			System.out.println("Day " + monday.getValue());
			Locale loc = Locale.getDefault();
			System.out.println("Full " + monday.getDisplayName(TextStyle.FULL, loc));
			System.out.println("Short " + monday.getDisplayName(TextStyle.SHORT, loc));
			System.out.println("Narrow " + monday.getDisplayName(TextStyle.NARROW, loc));
			System.out.println("-------------------------");
			DayOfWeek sunday = DayOfWeek.SUNDAY;
			System.out.println("compareTo " + sunday.compareTo(monday));
			System.out.println("compareTo " + monday.compareTo(sunday));
			System.out.println("compareTo " + sunday.compareTo(sunday));
			System.out.println("-------------------------");
			System.out.println("Day " + monday);
			System.out.println("-2 " + monday.minus(2));
			System.out.println("+2 " + monday.plus(2)); 

	}
}
