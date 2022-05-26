package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction  = entityManager.getTransaction();
		
		Parent parent = new Parent();
		parent.setName("Raju");
		parent.setEmail("raj@mail.com");
		parent.setPhone(2233445566l);
		
		entityTransaction.begin();
		
		entityManager.persist(parent);
		
		entityTransaction.commit();
		
	}
}
