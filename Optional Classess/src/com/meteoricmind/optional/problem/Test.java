package com.meteoricmind.optional.problem;


public class Test {
	public static void main(String[] args) {
		
		// Case-1
		//When Course has trainer 
		Trainer trainer1 = new Trainer("Akhilesh Bhagat", "akhil@meteoricmind.com", 8843545L);
		Course course1 = new Course("Java-8", 15000, trainer1);

		Student student1 = new Student("Sulekha", "sulekha@meteoricmind.com", 675675L, course1);
		//I have access to only student Object
		String trainerName1 = student1.getCourse().getTrainer().getTrainerName();
		System.out.println("Trainer Name : " + trainerName1);
	
		
		
		
	}
}