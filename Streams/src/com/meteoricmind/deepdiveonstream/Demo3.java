package com.meteoricmind.deepdiveonstream;

import java.util.*;
import java.util.stream.Collectors;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo3 {
	public static void main(String[] args) {
		List<Student> studentList = DataUtil.getStudentList();
		studentList.stream().sorted((stu1, stu2) -> stu1.getSname().compareTo(stu2.getSname()))
				.forEach(System.out::println);
		System.out.println("--------------------------");
		List<Student> mylist = studentList.stream().sorted((stu1, stu2) -> stu2.getSname().compareTo(stu1.getSname()))
				.collect(Collectors.toList());
		mylist.forEach(System.out::println);
	}
}