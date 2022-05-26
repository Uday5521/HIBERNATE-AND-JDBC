package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("Priyamani");
		person.setEmail("piya@mail.com");
		person.setPhone(99443322);
		
		Pan pan = new Pan();
		pan.setPanNumber("LMP67TYY");
		pan.setAddress("Banglore Raj layout");
		
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
	}
}
