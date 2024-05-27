package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.stream.Collectors;

public class Demo11 {
	public static void main(String[] args) {

		// What is total fee balance
		List<Student> studentList = DataUtil.getStudentList();
		double totalFeeBal = studentList.stream().collect(Collectors.summingDouble(Student::getFeeBal));
		System.out.println("Total fee Balance : " + totalFeeBal);

		System.out.println("---------------");
		//Whole fee will process so this is not a good approach
		// better use summingDouble
		double totalFeeBalance = studentList.stream().map(mystu -> mystu.getFeeBal()).reduce(0.0,
				(bal1, bal2) -> bal1 + bal2);
		System.out.println("Total fee Balance : " + totalFeeBalance);
	}
}
