package com.meteoricmind.stream.casestudy;

import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		List<Student> studentList = DataUtil.getStudentList();

		// Q1 Display the Student data.
		studentList.stream().forEach(System.out::println);
		System.out.println("=======================");
		// Q2. Display the students who has to pay the fee balance
		studentList.stream().filter(mystudent -> mystudent.getFeeBal() > 0).forEach(System.out::println);

	}
}
