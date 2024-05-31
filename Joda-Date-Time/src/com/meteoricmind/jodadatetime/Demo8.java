package com.meteoricmind.jodadatetime;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo8 {
	public static void main(String[] args) {
		Instant t1 = Instant.now();
		Instant t2 = Instant.parse("2017-03-05T10:15:30.00Z");
		Duration d1 = Duration.between(t1, t2);
		System.out.println(d1.toDays());
		System.out.println(d1.toHours());
		System.out.println(d1.toMinutes());
		long value = ChronoUnit.DAYS.between(t1, t2);
		System.out.println(value);
		Duration gap = Duration.ofSeconds(10);
		Instant t3 = t1.plus(gap);
		System.out.println(t1);
		System.out.println(t3);
		long value1 = ChronoUnit.SECONDS.between(t1, t3);
		System.out.println(value1);
	}
}