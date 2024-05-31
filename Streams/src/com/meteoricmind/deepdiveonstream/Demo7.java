package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.stream.Collectors;

public class Demo7 {
	public static void main(String[] args) {
		//Q7) Display the Students who joined for DevOps Course in ASC Order by Name 
		List<Student> studentList = DataUtil.getStudentList();
		List<Student> mylist = studentList.stream().filter(mystu -> mystu.getCourseName().equals("DevOps"))
				.sorted((stu1, stu2) -> stu1.getSname().compareTo(stu2.getSname())).collect(Collectors.toList());
		mylist.forEach(System.out::println);
	}
}