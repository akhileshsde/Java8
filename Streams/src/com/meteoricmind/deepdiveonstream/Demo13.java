package com.meteoricmind.deepdiveonstream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo13 {
	public static void main(String[] args) {
		// Q13) Display the Students Course-wise.

		List<Student> studentList = DataUtil.getStudentList();
		Map<String, List<Student>> stuMap = studentList.stream().collect(Collectors.groupingBy(Student::getCourseName));
		for (String cname : stuMap.keySet()) {
			List<Student> mylist = stuMap.get(cname);
			System.out.println("Student Joined for : " + cname);
			mylist.forEach(System.out::println);
			System.out.println("-------------------");
		}
	}
}
