package com.meteoricmind.datamodel.optional;

import java.util.Optional;
/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind private Limited
* */
public class Student {

	private String studentName;
	private String studentEmail;
	private long StudentPhone;
	private Optional<Course> course;

	public Student() {
	}

	public Student(String studentName, String studentEmail, long studentPhone, Optional<Course> course) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		StudentPhone = studentPhone;
		this.course = course;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentPhone() {
		return StudentPhone;
	}

	public void setStudentPhone(long studentPhone) {
		StudentPhone = studentPhone;
	}

	public Optional<Course> getCourse() {
		return course;
	}

	public void setCourse(Optional<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentEmail=" + studentEmail + ", StudentPhone="
				+ StudentPhone + ", course=" + course + "]";
	}

}