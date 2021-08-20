package com.amdocs.training.model;

public class Admin {
	private int admin_id;
	private String name;
	private String password;
	private String email;
	
	public Admin() {
		System.out.println("Admin Object Created!");
	}
	public Admin(int admin_id, String name, String password, String email) {
		super();
		this.admin_id = admin_id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
