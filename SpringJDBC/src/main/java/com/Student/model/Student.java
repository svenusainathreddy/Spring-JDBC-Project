package com.Student.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int sid;
	private String firstname;
	private String lastname;
	private int age;
	private long phone;
	private String emailid;
	private int passedout;

	@Autowired
	public Student() {

	}

	public Student(int sid, String firstname, String lastname, int age, long phone, String emailid, int passedout) {
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.phone = phone;
		this.emailid = emailid;
		this.passedout = passedout;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getPassedout() {
		return passedout;
	}

	public void setPassedout(int passedout) {
		this.passedout = passedout;
	}
}
