package com.meteoricmind.stream.casestudy;

import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
	public static void main(String[] args) {
		//Display the students who has to pay fee balance in descending order order by name
		
		List<Student> studentList = DataUtil.getStudentList();
		List<Student> newList=	studentList.stream()
		.filter(mystu->mystu.getFeeBal()>0)
		.sorted((stu1,stu2)->stu2.getSname().compareTo(stu1.getSname()))
		.collect(Collectors.toList());
		System.out.println(newList);
	}
}
