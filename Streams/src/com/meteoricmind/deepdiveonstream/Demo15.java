package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.stream.Collectors;

public class Demo15 {
	public static void main(String[] args) {
		//Q15) What is the Total Fee Bal to Receive?
		List<Student> studentList = DataUtil.getStudentList();
		double totalFeeBal = studentList.stream().collect(Collectors.summingDouble(Student::getFeeBal));
		System.out.println("Total Fee bal : " + totalFeeBal);
	}
}