package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetStudentFirstLevel {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		
		Student s = entityManager1.find(Student.class, 1);
		System.out.println(s);
		
		
		Student s2 = entityManager1.find(Student.class, 1);
		System.out.println(s2);
		
		
	}
}
