package com.amdocs.training.client;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.User;
public class UserClient {
public static void main(String[] args) {
	
		UserDAO dao = new UserDAOImpl();
		User user = new User(109, "Rahul", 9586234712L,"rahul@gmail.com","banglore","2021-12-21","rahul","img1.jpg");
		if(dao.saveUser(user)) {
		System.out.println("User Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}