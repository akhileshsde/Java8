package com.meteoricmind.datamodel.withoutoptional;


public class Test2 {
	public static void main(String[] args) {
		
		Course course2= new Course("Spring Core", 5000, null);
		Student student= new Student("Vivaan", "vivaan@meteoricmind.com", 342343L, course2);

		// I have access to Only Student Object and want trainer Email and Phone
		String trainerName = student.getCourse().getTrainer().getTrainerName();
		String trainerEmail = student.getCourse().getTrainer().getTrainerEmail();
		long trainerPhone = student.getCourse().getTrainer().getTrainerPhone(); 
		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone); 
	}
}

// We will get java.lang.NullPointerException because trainer details is not available 
