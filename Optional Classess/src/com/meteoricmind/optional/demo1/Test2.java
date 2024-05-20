package com.meteoricmind.optional.demo1;


public class Test2 {
	public static void main(String[] args) {
		
	
		
		//Case-2
		//Some course trainer is not there
		Course course2= new Course("Spring Core", 5000, null);
		Student student2= new Student("Vivaan", "vivaan@meteoricmind.com", 342343L, course2);
		String trainerName2 = student2.getCourse().getTrainer().getTrainerName();
		System.out.println("Trainer Name : " + trainerName2);
		
	}
}


// We will get java.lang.NullPointerException because trainer details is not available 
