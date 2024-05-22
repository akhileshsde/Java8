package com.meteoricmind.datamodel.withoutoptional;


public class Trainer {
private String trainerName;
private String trainerEmail;
private Long trainerPhone;

public Trainer() {
}

public Trainer(String trainerName, String trainerEmail, Long trainerPhone) {
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

public Long getTrainerPhone() {
	return trainerPhone;
}

public void setTrainerPhone(Long trainerPhone) {
	this.trainerPhone = trainerPhone;
}

@Override
public String toString() {
	return "Trainer [trainerName=" + trainerName + ", trainerEmail=" + trainerEmail + ", trainerPhone=" + trainerPhone
			+ "]";
}

 

}