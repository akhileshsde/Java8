package com.meteoricmind.deepdiveonstream;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
	public static List<Student> getStudentList() {

		List<Student> studentList = new ArrayList<>();
		Student stu1 = new Student(101, "sri", 555, "DevOps", 15000, 0);
		Student stu2 = new Student(102, "vas", 333, "MicroServices", 15000, 3000);
		Student stu3 = new Student(103, "sd", 777, "MicroServices", 19000, 0);
		Student stu4 = new Student(104, "ds", 222, "DevOps", 3000, 3000);
		Student stu5 = new Student(105, "hello", 111, "DevOps", 2000, 15000);
		Student stu6 = new Student(106, "aaa", 666, "DevOps", 13000, 2000);
		Student stu7 = new Student(107, "hai", 444, "MicroServices", 25000, 5000);
		Student stu8 = new Student(108, "bbb", 123, "Srping Boot", 12500, 0);
		Student stu9 = new Student(109, "ccc", 321, "Srping Boot", 9000, 0);

		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);
		studentList.add(stu7);
		studentList.add(stu8);
		studentList.add(stu9);

		return studentList;

	}
}
