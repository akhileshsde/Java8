package com.meteoricmind.jodadatetime;

import java.time.LocalDate;

public class Demo2 {
public static void main(String[] args) {
	LocalDate myDate = LocalDate.of(2021,8,22);
	System.out.println(myDate);
	System.out.println(myDate.getYear());
	System.out.println(myDate.getMonthValue());
	System.out.println(myDate.getMonth());
}
}
