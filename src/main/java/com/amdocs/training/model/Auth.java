package com.amdocs.training.model;

public class Auth {
	private String username;
	private String roll;
	
	public Auth() {System.out.println("created");}

	public Auth(String username, String roll) {
		super();
		this.username = username;
		this.roll = roll;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Auth [username=" + username + ", roll=" + roll + "]";
	}

}
