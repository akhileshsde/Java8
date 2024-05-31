package com.meteoricmind.jodadatetime;

import java.time.LocalTime;
import java.time.ZoneId;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo5 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(15, 23, 45);
		System.out.println(time);
		System.out.println("Hour :" + time.getHour());
		System.out.println("Min :" + time.getMinute());
		System.out.println("Sec :" + time.getSecond());
		System.out.println("Nano Sec :" + time.getNano());
		System.out.println("-------------------------");
		System.out.println("-2 Hour :" + time.minusHours(2));
		System.out.println("-2 Min :" + time.minusMinutes(2));
		System.out.println("-2 Sec :" + time.minusSeconds(2));
		System.out.println("+2 Hour :" + time.plusHours(2));
		System.out.println("+2 Min :" + time.plusMinutes(2));
		System.out.println("+2 Sec :" + time.plusSeconds(2));
		System.out.println("-------------------------");
		System.out.println(time);
		System.out.println("with Hour-12 :" + time.withHour(12));
		System.out.println("with Min-34 :" + time.withMinute(34));
		System.out.println("with Sec-56 :" + time.withSecond(56));
		System.out.println("-------------------------");
		System.out.println("MIN " + LocalTime.MIN);
		System.out.println("MID " + LocalTime.MIDNIGHT);
		System.out.println("NOON " + LocalTime.NOON);
		System.out.println("MAX" + LocalTime.MAX);
		System.out.println("now " + LocalTime.now());
		System.out.println("-------------------------");
		LocalTime currentTimeInLosAngeles = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		LocalTime currentTimeInLocalSystem = LocalTime.now(ZoneId.systemDefault());
		System.out.println(currentTimeInLosAngeles);
		System.out.println(currentTimeInLocalSystem);
	}
}
