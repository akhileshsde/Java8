package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.stream.Collectors;

public class Demo16 {
	public static void main(String[] args) {
		// Q16) What is the Total Fee Paid till now?
		List<Student> studentList = DataUtil.getStudentList();
		double totalFeePaid = studentList.stream().collect(Collectors.summingDouble(Student::getFeePaid));
		System.out.println("Total Fee Paid : " + totalFeePaid);
	}
}