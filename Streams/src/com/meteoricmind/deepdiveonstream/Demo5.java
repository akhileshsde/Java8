package com.meteoricmind.deepdiveonstream;

import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
	public static void main(String[] args) {
		// Q5) Find the Students whose feebal >=12000, Add 1000 to all of them Sort them
		// in Descending Order by FeeBal Store in ResultList.

		List<Student> studentList = DataUtil.getStudentList();
		System.out.println("--------------------------");
		List<Student> mylist = studentList.stream().filter(mystu -> mystu.getFeeBal() >= 2000).map(mystu -> {
			mystu.setFeeBal(mystu.getFeeBal() + 1000);
			return mystu;
		}).sorted((stu1, stu2) -> (int) (stu2.getFeeBal() - stu1.getFeeBal())).collect(Collectors.toList());
		mylist.forEach(System.out::println);
	}
}
