package com.meteoricmind.deepdiveonstream;

import java.util.*;
import java.util.stream.Collectors;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Demo14 {
	public static void main(String[] args) {
		//Q14) Display the Students who has to pay the Bal and Who Paid separately. 

		List<Student> studentList = DataUtil.getStudentList();
		Map<Boolean, List<Student>> stuMap = studentList.stream()
				.collect(Collectors.partitioningBy(stu -> stu.getFeeBal() == 0));
		for (boolean flag : stuMap.keySet()) {
			List<Student> mylist = stuMap.get(flag);
			if (flag) {
				System.out.println("Students with NO Bal: ");
			} else {
				System.out.println("Students with Bal to Pay: ");
			}
			mylist.forEach(System.out::println);
		}
	}
}