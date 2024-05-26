package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {
	public static void main(String[] args) {
		// Display the students who has to pay fee balance more than 12000 in descending
		// order order by name
		// fine 1000 as a penalty
		List<Student> studentList = DataUtil.getStudentList();
		List<Student> newList = studentList.stream().filter(mystu -> mystu.getFeeBal() > 3000)
				.map(mystu -> {
					mystu.setFeeBal(mystu.getFeeBal() + 1000);
					return mystu;})
.sorted((stu1, stu2) -> stu2.getSname().compareTo(stu1.getSname()))
.collect(Collectors.toList());
		newList.forEach(System.out::println);
	}
}
