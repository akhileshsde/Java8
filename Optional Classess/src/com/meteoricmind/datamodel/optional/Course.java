package com.meteoricmind.datamodel.optional;

import java.util.Optional;

public class Course {
	private String courseName;
	private double coursePrice;
	private Optional<Trainer> trainer;

	public Course() {
	}

	public Course(String courseName, int coursePrice, Optional<Trainer> trainer) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.trainer = trainer;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	public Optional<Trainer> getTrainer() {
		return trainer;
	}

	public void setTrainer(Optional<Trainer> trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", coursePrice=" + coursePrice + ", trainer=" + trainer + "]";
	}

}
