package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.Optional;

public class Demo7 {
	public static void main(String[] args) {
		// Display the students who paid max fee and Min fee
		List<Student> studentList = DataUtil.getStudentList();
		Optional<Student> studentOpsMax = studentList.stream()
				.max((stu1, stu2) -> (int) (stu1.getFeePaid() - stu2.getFeePaid()));
		studentOpsMax.ifPresent(System.out::println);
		
		
		System.out.println("=====================================");
		Optional<Student> studentOpsMin = studentList.stream()
				.min((stu1, stu2) -> (int) (stu1.getFeePaid() - stu2.getFeePaid()));
		studentOpsMin.ifPresent(System.out::println);
		
		
		System.out.println("=====================================");
		//Max fee balance
		Optional<Student> studentMaxFeeBal = studentList.stream()
				.max((stu1, stu2) -> (int) (stu1.getFeeBal() - stu2.getFeeBal()));
		studentMaxFeeBal.ifPresent(System.out::println);
	}
}
