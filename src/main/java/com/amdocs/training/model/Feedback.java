package com.amdocs.training.model;

public class Feedback {
	private Integer f_id;
	private Integer user_id;
	private String name;
	private String email;
	private String feedback;
	
	
	public Feedback() {
		System.out.println("Feedback Created!");
	}

	public Feedback(Integer f_id, Integer user_id, String name, String email, String feedback) {
		super();
		this.f_id = f_id;
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}

	public Integer getF_id() {
		return f_id;
	}

	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedback [f_id=" + f_id + ", user_id=" + user_id + ", name=" + name + ", email=" + email + ", feedback="
				+ feedback + "]";
	}

}
