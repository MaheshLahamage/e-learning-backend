package com.amdocs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.impl.FeedbackDAOImpl;
import com.amdocs.training.model.Feedback;

class FeedbackDAOJUnitTest {

	static Feedback feedback = null;
	static FeedbackDAO dao = null;

	@BeforeAll
	public static void init() { 
		feedback = new Feedback();
		dao = new FeedbackDAOImpl();
		System.out.println("Object Created");
	}
	@Test
	public void test_insert_feedback_success() {
		Feedback u =  new Feedback(null,101,"ankit","ankit@gmail.com","good");
		assertEquals(true, dao.saveFeedback(u));

	}

	@Test
	public void test_get_feedback_by_id_success() {

		assertEquals("ankit", dao.getFeedbackById(1).getName());
	}

	@Test
	public void test_get_all_feedbacks_success() {
		assertEquals(1, dao.findAll().size());
	}

	@Test
	public void test_delete_feedback_success() {

		assertEquals(true, dao.deleteFeedback(2));
	}

	@AfterAll
	public static void init1() { 
		feedback = null;
		dao = null;
		System.out.println("Object Destroyed");
	}
}