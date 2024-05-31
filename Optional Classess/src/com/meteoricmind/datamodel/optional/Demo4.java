package com.meteoricmind.datamodel.optional;

import java.util.Optional;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind private Limited
* */
public class Demo4 {
	public static void main(String[] args) {
		Course course = null;
		Student student = new Student("Hello", "hello@gmail", 111, Optional.ofNullable(course));
		Optional<Student> mystudent = Optional.ofNullable(student);

		String name = mystudent
				.flatMap(stu -> stu.getCourse().flatMap(cou -> cou.getTrainer().map(trnr -> trnr.getTrainerName())))
				.orElse("NO Name is Provided");

		String email = mystudent
				.flatMap(stu -> stu.getCourse().flatMap(cou -> cou.getTrainer().map(trnr -> trnr.getTrainerEmail())))
				.orElse("NO Email is Provided");
		String phone = mystudent
				.flatMap(stu -> stu.getCourse().flatMap(cou -> cou.getTrainer().map(trnr -> trnr.getTrainerPhone())))
				.orElse("NO Phone is Provided");

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);

		System.out.println("-----------------");

		String cname = mystudent.flatMap(mystu -> mystu.getCourse().map(mycou -> mycou.getCourseName()))
				.orElse("NO Course is Provided");
		double price = mystudent.flatMap(mystu -> mystu.getCourse().map(mycou -> mycou.getCoursePrice()))
				.orElse(25000.0);
		System.out.println(cname);
		System.out.println(price);

	}
}
