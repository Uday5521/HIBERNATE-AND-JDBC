package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveUser {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		User user = new User();
		user.setName("Dimple");
		user.setEmail("dim@email.com");
		user.setPassword("ghjk");
		user.setGender("female");
		
	
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}
}
