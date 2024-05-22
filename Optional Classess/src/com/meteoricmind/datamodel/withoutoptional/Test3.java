package com.meteoricmind.datamodel.withoutoptional;

public class Test3 {
	public static void main(String[] args) {

		// Case-2
		// Some course Details is not available
		Student student = new Student("Vivaan", "vivaan@meteoricmind.com", 342343L, null);
		String trainerName = student.getCourse().getTrainer().getTrainerName();
		String trainerEmail = student.getCourse().getTrainer().getTrainerEmail();
		long trainerPhone = student.getCourse().getTrainer().getTrainerPhone();
		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);

	}
}

// We will get java.lang.NullPointerException because trainer details is not available 
