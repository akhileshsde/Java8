package com.meteoricmind.stream.casestudy;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

	public static List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<>();
		Student stu1 = new Student(101, "sri", 555, "Devops", 15000, 0);
		Student stu2 = new Student(102, "vas", 333, "MicroServices", 15000, 3000);
		Student stu3 = new Student(103, "akb", 444, "MicroServices", 19000, 0);
		Student stu4 = new Student(104, "sd", 767, "Devops", 3000, 2000);
		Student stu5 = new Student(105, "ds", 892, "Devops", 3000, 2000);
		Student stu6 = new Student(106, "hello", 720, "Devops", 13000, 7000);
		Student stu7 = new Student(107, "aaa", 5367, "MicroServices", 25000, 0);
		Student stu8 = new Student(108, "hai", 1034, "Spring Boot", 125000, 00);
		Student stu9 = new Student(109, "bbb", 555, "Spring Boot", 9000, 0);
		Student stu10 = new Student(110, "yyy", 555, "Zzz", 9000, 0);
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);
		studentList.add(stu7);
		studentList.add(stu8);
		studentList.add(stu9);
		
		studentList.add(stu10);
		return studentList;
	}
}
