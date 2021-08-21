package com.amdocs.training.model;

public class Contact {
	private Integer contact_id;
	private Integer user_id;
	private String name;
	private String email;
	private String phone_no;
	private String message;
	
	public Contact() {
		System.out.println("Contact Created!");
	}

	public Contact(Integer contact_id, Integer user_id, String name, String email, String phone_no, String message) {
		super();
		this.contact_id = contact_id;
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.message = message;
	}

	public Integer getContact_id() {
		return contact_id;
	}

	public void setContact_id(Integer contact_id) {
		this.contact_id = contact_id;
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

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", user_id=" + user_id + ", name=" + name + ", email=" + email
				+ ", phone_no=" + phone_no + ", message=" + message + "]";
	}
	
	
}
