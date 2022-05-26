package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction  = entityManager.getTransaction();
		
		
		Student s = new Student();
		s.setId(3);
		s.setName("Simran");
		s.setPercentage(77.79);
		
		entityTransaction.begin();
		
		entityManager.persist(s);
		
		entityTransaction.commit();
		
		System.out.println("----------------------Done-------------------");
	}
}
