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
		if(student != null) {
			List<Course> courses = student.getCourses();
			
			System.out.println("Name is "+student.getName());
			System.out.println("Email is "+student.getEmail());
			System.out.println("**************Course**************");
			for(Course course : courses) {
				System.out.println("Course Name is "+course.getName());
				System.out.println("Course duration is "+course.getDuration());
				System.out.println("---------------------------------");
			}
			
			
		} else {
			System.out.println("Sorry no student exist");
		}
	}
}
