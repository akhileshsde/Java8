package com.meteoricmind.optional.demo1;


public class Test3 {
	public static void main(String[] args) {
		
	
		
		//Case-2
		//Some course Details is not available
		Student student2= new Student("Vivaan", "vivaan@meteoricmind.com", 342343L, null);
		String trainerName2 = student2.getCourse().getTrainer().getTrainerName();
		System.out.println("Trainer Name : " + trainerName2);
		
	}
}

// We will get java.lang.NullPointerException because trainer details is not available 
