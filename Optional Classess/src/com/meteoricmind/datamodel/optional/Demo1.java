package com.meteoricmind.datamodel.optional;

import java.util.Optional;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind private Limited
* */
public class Demo1 {
	public static void main(String[] args) {
		Trainer trainer = new Trainer("Akhilesh", "akhil@meteoricmind", "435345");
		Course course = new Course("Deveops", 1455, Optional.ofNullable(trainer));
		Student student = new Student("Akhilesh", "akhil@gmail.com", 4124, Optional.ofNullable(course));

		Optional<Student> myStudent = Optional.ofNullable(student);

		Optional<Course> myCourse = myStudent.flatMap(mystu -> mystu.getCourse());
		Optional<Trainer> myTrainer = myCourse.flatMap(mytrainer -> mytrainer.getTrainer());
		Optional<String> nameOpts = myTrainer.map(myTrnr -> myTrnr.getTrainerName());
		String name = nameOpts.orElse("No Name is given");
		Optional<String> emailOpts = myTrainer.map(myTrnr -> myTrnr.getTrainerEmail());
		String email = emailOpts.orElse("No Email is given");
		Optional<String> phoneOpts = myTrainer.map(myTrnr -> myTrnr.getTrainerPhone());
		String phone = phoneOpts.orElse("No Phone is given"); 
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone); 

	}
}
