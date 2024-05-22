package com.meteoricmind.datamodel.withoutoptional2;

public class Test {
	public static void main(String[] args) {

		// Trainer trainer1 = new Trainer("Akhilesh Bhagat", "akhil@meteoricmind.com",
		// 8843545L);
		// Course course1 = new Course("Java-8", 15000, null);
		Student student = new Student("Sulekha", "sulekha@meteoricmind.com", 675675L, null);

		String trainerName = "No Name available";
		String trainerEmail = "No Email Provided";
		long trainerPhone = 0;

		if (student != null) {
			Course mycourse = student.getCourse();
			if (mycourse != null) {
				Trainer mytrainer = mycourse.getTrainer();
				if (mytrainer != null) {
					trainerName = mytrainer.getTrainerName();
					trainerEmail = mytrainer.getTrainerEmail();
					trainerPhone = mytrainer.getTrainerPhone();
				}
			}

			System.out.println("Trainer Name " + trainerName);
			System.out.println("Trainer Email " + trainerEmail);
			System.out.println("Trainer Phone " + trainerPhone);

		}
	}
}