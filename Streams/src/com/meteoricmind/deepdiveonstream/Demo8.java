package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.stream.Collectors;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo8 {
	public static void main(String[] args) {
		// Q8) Display the Students who joined for DevOps Course in DESC Order by Name
		List<Student> studentList = DataUtil.getStudentList();
		List<Student> mylist = studentList.stream().filter(mystu -> mystu.getCourseName().equals("DevOps"))
				.sorted((stu1, stu2) -> stu2.getSname().compareTo(stu1.getSname())).collect(Collectors.toList());
		mylist.forEach(System.out::println);
	}
}
