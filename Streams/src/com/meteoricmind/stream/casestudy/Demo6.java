package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {
	public static void main(String[] args) {
		// Display the students who joined for devops and display the list in descending
		List<Student> studentList = DataUtil.getStudentList();
		long count = studentList.stream().filter(mystu -> mystu.getCourseName().equals("Devops"))
				.filter(mystu -> mystu.getFeeBal() > 0)
				.collect(Collectors.counting());
				System.out.println(count);
	}
}
