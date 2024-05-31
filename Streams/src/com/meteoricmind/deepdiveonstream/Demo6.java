package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {
	public static void main(String[] args) {
		// Q6) Display the Students who joined for DevOps Course.
		List<Student> studentList = DataUtil.getStudentList();
		System.out.println("--------------------------");
		List<Student> mylist = studentList.stream().filter(mystu -> mystu.getCourseName().equals("DevOps"))
				.collect(Collectors.toList());
		mylist.forEach(System.out::println);
	}
}