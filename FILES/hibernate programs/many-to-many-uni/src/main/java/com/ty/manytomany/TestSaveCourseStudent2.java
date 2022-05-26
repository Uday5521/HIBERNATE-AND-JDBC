package com.ty.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCourseStudent2 {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Student student = new Student();
		student.setName("Divya");
		student.setEmail("div@email.com");
		
		Course course1 = entityManager.find(Course.class, 2);
		Course course2 = entityManager.find(Course.class, 3);
		
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		
		
		student.setCourses(courses);
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
}
