package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
	public static void main(String[] args) {

		// Display the students who joined for devops
		List<Student> studentList = DataUtil.getStudentList();
		List<Student> newList = studentList.stream().filter(mystu -> mystu.getCourseName().equals("Devops"))
				.collect(Collectors.toList());
		newList.forEach(System.out::println);
		System.out.println("=====================");
		// Display the students who joined for devops and display the list in ascending
		List<Student> studentList2 = DataUtil.getStudentList();
		List<Student> newList2 = studentList2.stream().filter(mystu -> mystu.getCourseName().equals("Devops"))
				.sorted((stu1, stu2) -> stu1.getSname().compareTo(stu2.getSname())).collect(Collectors.toList());
		newList2.forEach(System.out::println);
	}
}
