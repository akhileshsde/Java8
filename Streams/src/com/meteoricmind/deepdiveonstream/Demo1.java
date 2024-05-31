package com.meteoricmind.deepdiveonstream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		//Display the Student Data
		List<Student> studentList = DataUtil.getStudentList();
		studentList.stream().forEach(System.out::println);
		System.out.println("--------------------------");
		List<Student> mylist1 = studentList.stream().collect(Collectors.toList());
		mylist1.forEach(System.out::println);
		System.out.println("--------------------------");
	}
}
