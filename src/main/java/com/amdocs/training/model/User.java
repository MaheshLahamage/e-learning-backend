package com.amdocs.training.model;

public class User {
	private Integer user_id;
	private String name;
	private String phone_no;
	private String email;
	private String address;
	private String reg_date;
	private String upload_photo;
	private String password;
	
	public User() {System.out.println("created");}

	public User(Integer user_id, String name, String phone_no, String email, String address, String reg_date,
			String upload_photo, String password) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
		this.address = address;
		this.reg_date = reg_date;
		this.upload_photo = upload_photo;
		this.password = password;
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

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getUpload_photo() {
		return upload_photo;
	}

	public void setUpload_photo(String upload_photo) {
		this.upload_photo = upload_photo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", phone_no=" + phone_no + ", email=" + email
				+ ", address=" + address + ", reg_date=" + reg_date + ", upload_photo=" + upload_photo + ", password="
				+ password + "]";
	}
	
	
}
