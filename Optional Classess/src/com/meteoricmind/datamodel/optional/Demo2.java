package com.meteoricmind.datamodel.optional;

import java.util.Optional;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind private Limited
* */
public class Demo2 {
	public static void main(String[] args) {
		Trainer trainer = new Trainer("Srinivas", "sri@jlc", "12345");
		Course course = new Course("DevOps", 15000, Optional.ofNullable(trainer));
		Student student = new Student("Hello", "hello@gmail", 111, Optional.ofNullable(course));
		Optional<Student> mystudent = Optional.ofNullable(student);

		String name =mystudent.flatMap(stu -> stu.getCourse().flatMap(cou -> cou.getTrainer().map(trnr -> trnr.getTrainerName())))
				.orElse("NO Name is Provided");
		
		String email =mystudent.flatMap(stu -> stu.getCourse().flatMap(cou -> cou.getTrainer().map(trnr -> trnr.getTrainerEmail())))
				.orElse("NO Email is Provided");
		String phone =mystudent.flatMap(stu -> stu.getCourse().flatMap(cou -> cou.getTrainer().map(trnr -> trnr.getTrainerPhone())))
				.orElse("NO Phone is Provided");
	
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);

	}
}
