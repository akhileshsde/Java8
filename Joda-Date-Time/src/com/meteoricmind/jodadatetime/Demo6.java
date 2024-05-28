package com.meteoricmind.jodadatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Demo6 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println("Year :" + dateTime.getYear());
		System.out.println("Month :" + dateTime.getMonth());
		System.out.println("Mon Value :" + dateTime.getMonthValue());
		System.out.println("Date :" + dateTime.getDayOfMonth());
		System.out.println("Hour :" + dateTime.getHour());
		System.out.println("Min :" + dateTime.getMinute());
		System.out.println("Sec :" + dateTime.getSecond());
		System.out.println("Nano Sec :" + dateTime.getNano());
		System.out.println("----------------");
		System.out.println("-2 Hour :" + dateTime.minusHours(2));
		System.out.println("-2 Min :" + dateTime.minusMinutes(2));
		System.out.println("-2 Sec :" + dateTime.minusSeconds(2));
		System.out.println("+2 Hour :" + dateTime.plusHours(2));
		System.out.println("+2 Min :" + dateTime.plusMinutes(2));
		System.out.println("+2 Sec :" + dateTime.plusSeconds(2));
		System.out.println(dateTime);
		System.out.println("----------------");
		System.out.println("with Hour-12 :" + dateTime.withHour(12));
		System.out.println("with Year-2019 :" + dateTime.withYear(2019));
		LocalDateTime currentTimeInLosAngeles = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		LocalDateTime currentTimeInLocalSystem = LocalDateTime.now(ZoneId.systemDefault());
		System.out.println(currentTimeInLosAngeles);
		System.out.println(currentTimeInLocalSystem);
	}
}
