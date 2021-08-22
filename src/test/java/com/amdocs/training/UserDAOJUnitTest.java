package com.amdocs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.User;

class UserDAOJUnitTest {

	static User user = null;
	static UserDAO dao = null;

	@BeforeAll
	public static void init() { 
		user = new User();
		dao = new UserDAOImpl();
		System.out.println("Object Created");
	}
	@Test
	public void test_insert_user_success() {
		User u =  new User(null, "Rahul", "9586234712" ,"rahul@gmail.com","banglore","2021-12-21","rahul","img1.jpg");
		assertEquals(true, dao.saveUser(u));

	}

	@Test
	public void test_get_user_by_id_success() {

		assertEquals("Raj", dao.getUserById(120).getName());
	}

	@Test
	public void test_get_all_users_success() {
		assertEquals(13, dao.findAll().size());
	}

	@Test
	public void test_delete_user_success() {

		assertEquals(true, dao.deleteUser(120));
	}

	@AfterAll
	public static void init1() { 
		user = null;
		dao = null;
		System.out.println("Object Destroyed");
	}
}