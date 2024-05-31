package com.meteoricmind.deepdiveonstream;

import java.util.*;
import java.util.stream.Collectors;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo12 {
	public static void main(String[] args) {
		//Q12) Which Student Fee bal is more (max) 

		List<Student> studentList = DataUtil.getStudentList();
		Optional<Student> studentOpts3 = studentList.stream()
				.max((stu1, stu2) -> (int) (stu1.getFeeBal() - stu2.getFeeBal()));
		studentOpts3.ifPresent(System.out::println);
		System.out.println("--------------------------");
		Optional<Student> stuOpts1 = studentList.stream()
				.collect(Collectors.maxBy((stu1, stu2) -> (int) (stu1.getFeeBal() - stu2.getFeeBal())));
		stuOpts1.ifPresent(System.out::println);
	}
}