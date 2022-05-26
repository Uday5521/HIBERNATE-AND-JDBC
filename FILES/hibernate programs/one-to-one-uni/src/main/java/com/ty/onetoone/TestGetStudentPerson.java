package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetStudentPerson {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		
		Student s = entityManager1.find(Student.class, 1);
		System.out.println(s);
		
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		Student s2 = new Student();
		s2.setName("Asha");
		s2.setEmail("asha@mail.com");
		
		EntityTransaction entityTransaction = entityManager2.getTransaction();
		entityTransaction.begin();
		entityManager2.persist(s2);
		entityTransaction.commit();
	}
}
