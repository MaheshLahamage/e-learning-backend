package com.amdocs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.impl.AdminDAOImpl;
import com.amdocs.training.model.Admin;

class AdminDAOJUnitTest {

	static Admin admin = null;
	static AdminDAO dao = null;

	@BeforeAll
	public static void init() { 
		admin = new Admin();
		dao = new AdminDAOImpl();
		System.out.println("Object Created");
	}
	@Test
	public void test_insert_admin_success() {
		Admin a =  new Admin(105,"admin5", "admin@123", "admin@gmail.com");
		assertEquals(true, dao.saveAdmin(a));

	}

	@Test
	public void test_get_admin_by_id_success() {

		assertEquals("admin1", dao.getAdminById(101).getName());
	}

	@Test
	public void test_get_all_admins_success() {
		assertEquals(3, dao.findAll().size());
	}

	@Test
	public void test_delete_admin_success() {

		assertEquals(true, dao.deleteAdmin(105));
	}

	@AfterAll
	public static void init1() { 
		admin = null;
		dao = null;
		System.out.println("Object Destroyed");
	}
}