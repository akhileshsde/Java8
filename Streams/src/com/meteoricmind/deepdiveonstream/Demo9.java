package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.stream.Collectors;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo9 {
	public static void main(String[] args) {
		// Q9) How Many Students has to pay the fee bal from DevOps Course
		List<Student> studentList = DataUtil.getStudentList();
		System.out.println("--------------------------");
		long count1 = studentList.stream().filter(mystu -> mystu.getCourseName().equals("DevOps"))
				.filter(mystu -> mystu.getFeeBal() > 0).collect(Collectors.counting());
		System.out.println(count1);
	}
}