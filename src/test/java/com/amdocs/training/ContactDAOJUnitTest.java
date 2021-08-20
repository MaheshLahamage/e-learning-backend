package com.amdocs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.impl.ContactDAOImpl;
import com.amdocs.training.model.Contact;

class ContactDAOJUnitTest {

	static Contact contact = null;
	static ContactDAO dao = null;

	@BeforeAll
	public static void init() { 
		contact = new Contact();
		dao = new ContactDAOImpl();
		System.out.println("Object Created");
	}
	@Test
	public void test_insert_contact_success() {
		Contact c =  new Contact(103, "Rahul", "Rahul@gmail.com", 324342343L, "Message",2);
		assertEquals(true, dao.saveContact(c));

	}

	@Test
	public void test_get_contact_by_id_success() {

		assertEquals("Ankit", dao.getContactById(1).getName());
	}

	@Test
	public void test_get_all_contacts_success() {
		assertEquals(2, dao.findAll().size());
	}

	@Test
	public void test_delete_contact_success() {

		assertEquals(true, dao.deleteContact(2));
	}

	@AfterAll
	public static void init1() { 
		contact = null;
		dao = null;
		System.out.println("Object Destroyed");
	}
}