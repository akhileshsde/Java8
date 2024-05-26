package com.meteoricmind.stream.casestudy;

import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<Student> studentList = DataUtil.getStudentList();
		//Q3.Display the students in ascending order
		studentList.stream()
		.sorted((stu1,stu2)->stu1.getSname().compareTo(stu2.getSname()))
		.forEach(System.out::println);
		
		System.out.println("====================================");
		//Q3.Display the students  in descending order
		studentList.stream()
		.filter(mystu->mystu.getFeeBal()>0)
		.sorted((stu1,stu2)->stu2.getSname().compareTo(stu1.getSname()))
		.forEach(System.out::println);
		
		System.out.println("====================================");
		//Q3.Display the students  in descending order
				studentList.stream()
				.filter(mystu->mystu.getFeeBal()>0 )
				.filter(mystu->mystu.getCourseName()=="MicroServices")
				.sorted((stu1,stu2)->stu2.getSname().compareTo(stu1.getSname()))
				.forEach(System.out::println);
	}
}
