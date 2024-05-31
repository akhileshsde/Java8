package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo10 {
	public static void main(String[] args) {
		// Q10) Which Student has Paid Fee more (max)

		List<Student> studentList = DataUtil.getStudentList();
		Optional<Student> studentOpts1 = studentList.stream()
				.max((stu1, stu2) -> (int) (stu1.getFeePaid() - stu2.getFeePaid()));
		studentOpts1.ifPresent(System.out::println);
		System.out.println("--------------------------");
		Optional<Student> stuOpts1 = studentList.stream()
				.collect(Collectors.maxBy((stu1, stu2) -> (int) (stu1.getFeePaid() - stu2.getFeePaid())));
		stuOpts1.ifPresent(System.out::println);
	}
}