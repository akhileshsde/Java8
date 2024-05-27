package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo10 {
	public static void main(String[] args) {

		// What is total fee balance/fee paid to be paid course wise
		List<Student> studentList = DataUtil.getStudentList();
		Map<String, Double> feeBalMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getCourseName, Collectors.summingDouble(Student::getFeeBal)));

		for (String courseName : feeBalMap.keySet()) {
			System.out.println(courseName + " : " + feeBalMap.get(courseName));

			

		}
		System.out.println("-----------------------------");
		Map<String, Double> feePaidMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getCourseName, Collectors.summingDouble(Student::getFeePaid)));

		for (String courseName : feePaidMap.keySet()) {
			System.out.println(courseName + " : " + feePaidMap.get(courseName));
		}

	}
}
