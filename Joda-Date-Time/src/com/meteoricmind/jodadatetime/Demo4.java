package com.meteoricmind.jodadatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

public class Demo4 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate nextWedDate = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("nextWed Date :" + nextWedDate);
		LocalDate lastWedDate = date.with(TemporalAdjusters.lastInMonth(DayOfWeek.WEDNESDAY));
		System.out.println("lastWedDate:" + lastWedDate);
		System.out.println("-2 Year :" + date.minusYears(2));
		System.out.println("-2 Mon :" + date.minusMonths(4));
		System.out.println("-2 Wk :" + date.minusWeeks(2));
		System.out.println("-2 Day :" + date.minusDays(2));
		System.out.println("--------------------");
		System.out.println(date);
		System.out.println("+2 Year :" + date.plusYears(2));
		System.out.println("+2 Mon :" + date.plusMonths(2));
		System.out.println("+2 Wk :" + date.plusWeeks(2));
		System.out.println("+2 Day :" + date.plusDays(2));
		System.out.println(date);
		System.out.println("--------------------");
		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.MAX);
		System.out.println("--------------------");
		LocalDate currentDateInLosAngeles = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		LocalDate currentDateInLocalSystem = LocalDate.now(ZoneId.systemDefault());
		System.out.println(currentDateInLosAngeles);
		System.out.println(currentDateInLocalSystem);
	}
}