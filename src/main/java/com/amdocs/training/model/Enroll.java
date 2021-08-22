package com.amdocs.training.model;

public class Enroll {
	private Integer user_id;
	private Integer Course_id;
	
	public Enroll() {System.out.println("created");}

	public Enroll(Integer user_id, Integer course_id) {
		super();
		this.user_id = user_id;
		Course_id = course_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getCourse_id() {
		return Course_id;
	}

	public void setCourse_id(Integer course_id) {
		Course_id = course_id;
	}

	@Override
	public String toString() {
		return "Enroll [user_id=" + user_id + ", Course_id=" + Course_id + "]";
	}
	
}
