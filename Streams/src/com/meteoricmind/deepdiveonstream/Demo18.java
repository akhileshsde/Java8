package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo18 {
	public static void main(String[] args) {
		// Q18) What is the Total Fee Paid till now by Course-wise?

		List<Student> studentList = DataUtil.getStudentList();
		Map<String, Double> feePaidMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getCourseName, Collectors.summingDouble(Student::getFeePaid)));
		for (String courseName : feePaidMap.keySet()) {
			System.out.println(courseName + " : " + feePaidMap.get(courseName));
		}
	}
}
