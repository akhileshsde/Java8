package com.meteoricmind.datamodel.optional;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind private Limited
* */
public class Trainer {
	private String trainerName;
	private String trainerEmail;
	private String trainerPhone;

	public Trainer() {
	}

	public Trainer(String trainerName, String trainerEmail, String trainerPhone) {
		super();
		this.trainerName = trainerName;
		this.trainerEmail = trainerEmail;
		this.trainerPhone = trainerPhone;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerEmail() {
		return trainerEmail;
	}

	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}

	public String getTrainerPhone() {
		return trainerPhone;
	}

	public void setTrainerPhone(String trainerPhone) {
		this.trainerPhone = trainerPhone;
	}

	@Override
	public String toString() {
		return "Trainer [trainerName=" + trainerName + ", trainerEmail=" + trainerEmail + ", trainerPhone="
				+ trainerPhone + "]";
	}

}