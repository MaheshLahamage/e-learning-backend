package com.amdocs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.impl.CourseDAOImpl;
import com.amdocs.training.model.Course;

class CourseDAOJUnitTest {

	static Course course = null;
	static CourseDAO dao = null;

	@BeforeAll
	public static void init() { 
		course = new Course();
		dao = new CourseDAOImpl();
		System.out.println("Object Created");
	}
	@Test
	public void test_insert_course_success() {
		Course u =  new Course(3002, "Spring Boot", 3500, "GOF and Sun Design Patterns", "video.mp4");
		assertEquals(true, dao.saveCourse(u));

	}

	@Test
	public void test_get_course_by_id_success() {

		assertEquals("Design Patterns", dao.getCourseById(3001).getC_name());
	}

	@Test
	public void test_get_all_courses_success() {
		assertEquals(1, dao.findAll().size());
	}

	@Test
	public void test_delete_course_success() {

		assertEquals(true, dao.deleteCourse(3002));
	}

	@AfterAll
	public static void init1() { 
		course = null;
		dao = null;
		System.out.println("Object Destroyed");
	}
}