package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
	public static void main(String[] args) {
		// Display the students who joined for devops and display the list in descending
		List<Student> studentList = DataUtil.getStudentList();
		List<Student> newList = studentList.stream().filter(mystu -> mystu.getCourseName().equals("Devops"))
.sorted((stu1, stu2) -> stu2.getSname().compareTo(stu1.getSname()))
.collect(Collectors.toList());
		newList.forEach(System.out::println);
	}
}
