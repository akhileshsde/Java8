package com.meteoricmind.jodadatetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo7 {
	public static void main(String[] args) {
		System.out.println(Instant.MIN);
		System.out.println(Instant.MAX);
		System.out.println(Instant.EPOCH);
		Instant instant = Instant.now();
		System.out.println(instant);
		System.out.println(instant.minus(2, ChronoUnit.MILLIS));
		System.out.println(instant.minusMillis(2));
		System.out.println(instant.getEpochSecond());
		long secondsFromEpoch = Instant.ofEpochSecond(0L).until(Instant.now(), ChronoUnit.SECONDS);
		System.out.println(secondsFromEpoch);
		long millisFromEpoch = Instant.ofEpochSecond(0L).until(Instant.now(), ChronoUnit.MILLIS);
		System.out.println(millisFromEpoch);
		Date dt = new Date();
		System.out.println(dt.getTime());
		LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDateTime dateTimeUTC = LocalDateTime.ofInstant(instant, ZoneId.of("UTC"));
		System.out.println(instant);
		System.out.println(dateTimeUTC);
		System.out.println(dateTime);
	}
}