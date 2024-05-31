package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {
	public static void main(String[] args) {

		// Q4) Display the Students who has to pay the Fee Balance in Descending Order
		// by Name.

		List<Student> studentList = DataUtil.getStudentList();
		studentList.stream().filter(mystu -> mystu.getFeeBal() > 0)
				.sorted((stu1, stu2) -> stu2.getSname().compareTo(stu1.getSname())).forEach(System.out::println);
		List<Student> mylist = studentList.stream().filter(mystu -> mystu.getFeeBal() > 0)
				.sorted((stu1, stu2) -> stu2.getSname().compareTo(stu1.getSname())).collect(Collectors.toList());
		mylist.forEach(System.out::println);
	}
}
