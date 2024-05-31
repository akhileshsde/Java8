package com.meteoricmind.deepdiveonstream;

/*
* @Author : Akhilesh Bhagat
* @Company: Meteoric Mind
* */
public class Student {
	private int sid;
	private String sname;
	private long phone;
	private String courseName; // Course course;
	private double feePaid; // Fee fee;
	private double feeBal;

	public Student() {
	}

	public Student(int sid, String sname, long phone, String courseName, double feePaid, double feeBal) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.phone = phone;
		this.courseName = courseName;
		this.feePaid = feePaid;
		this.feeBal = feeBal;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFeePaid() {
		return feePaid;
	}

	public void setFeePaid(double feePaid) {
		this.feePaid = feePaid;
	}

	public double getFeeBal() {
		return feeBal;
	}

	public void setFeeBal(double feeBal) {
		this.feeBal = feeBal;
	}

	@Override
	public String toString() {
		return " [" + sid + ", " + sname + ", " + phone + ", " + courseName + ", " + feePaid + ", " + feeBal + "]";
	}
}