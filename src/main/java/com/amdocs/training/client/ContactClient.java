package com.amdocs.training.client;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.impl.ContactDAOImpl;
import com.amdocs.training.model.Contact;
public class ContactClient {
public static void main(String[] args) {
	
		ContactDAO dao = new ContactDAOImpl();
		Contact contact = new Contact(null, 101, "rahul", "Rahul@gmail.com", "8324323433", "Message");
		if(dao.saveContact(contact)) {
		System.out.println("Contact Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}