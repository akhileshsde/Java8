package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo8 {
	public static void main(String[] args) {
		// Display the students group by course name
		List<Student> studentList = DataUtil.getStudentList();
		Map<String, List<Student>> stuMap = studentList.stream().collect(Collectors.groupingBy(Student::getCourseName));
		for (String cname : stuMap.keySet()) {
			List<Student> stuList = stuMap.get(cname);
			System.out.println("Student joined for :" + cname);
			stuList.forEach(System.out::println);
			System.out.println("-----------------------------");
		}

	}
}
