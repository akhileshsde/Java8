package com.meteoricmind.jodadatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo9 {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime birthday = LocalDateTime.of(1978, Month.JUNE, 16, 9, 00, 00);
		Duration gap = Duration.between(birthday, today);
		System.out.println(gap.toDays());
		LocalDate today1 = LocalDate.now();
		LocalDate birthday1 = LocalDate.of(1978, Month.JUNE, 16);
		Period p1 = Period.between(birthday1, today1);
		long days1 = ChronoUnit.DAYS.between(birthday, today);
		System.out.println("You are " + p1.getYears() + " years, " + p1.getMonths() + " months, and " + p1.getDays()
				+ " days old. (" + days1 + " days total)");
	}
}