package com.ty.manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentCourse {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Student student = entityManager.find(Student.class, 1);
		System.out.println(student);
		
		List<Course> cs = student.getCourses()
				;
		System.out.println(cs);
	}
}
