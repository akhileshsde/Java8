package com.meteoricmind.deepdiveonstream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo17 {
	public static void main(String[] args) {
		// Q17) What is the Total Fee Bal to Receive Course-wise?

		List<Student> studentList = DataUtil.getStudentList();
		Map<String, Double> feeBalMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getCourseName, Collectors.summingDouble(Student::getFeeBal)));
		for (String courseName : feeBalMap.keySet()) {
			System.out.println(courseName + " : " + feeBalMap.get(courseName));
		}
	}
}