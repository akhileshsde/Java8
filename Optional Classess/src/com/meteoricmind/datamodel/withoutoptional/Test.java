package com.meteoricmind.datamodel.withoutoptional;


public class Test {
	public static void main(String[] args) {
		
		Trainer trainer1 = new Trainer("Akhilesh Bhagat", "akhil@meteoricmind.com", 8843545L);
		Course course1 = new Course("Java-8", 15000, trainer1);
		Student student1 = new Student("Sulekha", "sulekha@meteoricmind.com", 675675L, course1);
	
		// I have access to Only Student Object and want trainer Email and Phone
		String trainerName = student1.getCourse().getTrainer().getTrainerName();
		String trainerEmail = student1.getCourse().getTrainer().getTrainerEmail();
		long trainerPhone = student1.getCourse().getTrainer().getTrainerPhone();
		System.out.println("Trainer Name "+trainerName);
		System.out.println("Trainer Email "+trainerEmail);
		System.out.println("Trainer Phone "+trainerPhone);
		
	}
}