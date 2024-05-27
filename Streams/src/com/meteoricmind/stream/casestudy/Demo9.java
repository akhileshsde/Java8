package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo9 {
	public static void main(String[] args) {
		// Display the student list who has fee balance
		//Used partitioningBy
		List<Student> studentList = DataUtil.getStudentList();
		Map<Boolean, List<Student>> stuMap = studentList.stream()
				.collect(Collectors.partitioningBy(stu -> stu.getFeeBal() == 0));
		for (Boolean flag : stuMap.keySet()) {
			List<Student> stuList = stuMap.get(flag);
			if (flag) {
				System.out.println("Students with no fee balance");
			} else {
				System.out.println("Students with  fee balance");
			}
			stuList.forEach(System.out::println);
			System.out.println("-----------------------------");
		}

	}
}
