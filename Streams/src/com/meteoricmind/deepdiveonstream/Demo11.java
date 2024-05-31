
package com.meteoricmind.deepdiveonstream;

import java.util.*;
import java.util.stream.Collectors;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo11 {
	public static void main(String[] args) {
		//Q11) Which Student has Paid Fee less (min) 

		List<Student> studentList = DataUtil.getStudentList();
		Optional<Student> studentOpts2 = studentList.stream()
				.min((stu1, stu2) -> (int) (stu1.getFeePaid() - stu2.getFeePaid()));
		studentOpts2.ifPresent(System.out::println);
		System.out.println("--------------------------");
		Optional<Student> stuOpts2 = studentList.stream()
				.collect(Collectors.minBy((stu1, stu2) -> (int) (stu1.getFeePaid() - stu2.getFeePaid())));
		stuOpts2.ifPresent(System.out::println);
	}
}