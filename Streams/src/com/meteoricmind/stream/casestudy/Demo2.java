package com.meteoricmind.stream.casestudy;

import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<Student> studentList = DataUtil.getStudentList();
		//Q3.Display the students in ascending order
		studentList.stream()
		.sorted((stu1,stu2)->stu1.getSname().compareTo(stu2.getSname()))
		.forEach(System.out::println);
		
	}
}
