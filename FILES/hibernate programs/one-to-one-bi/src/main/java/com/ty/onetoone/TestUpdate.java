package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicl vehicl = entityManager.find(Vehicl.class, 5);
		
		if(vehicl != null) {
			Charcy charcy = vehicl.getCharcy();
			
			entityTransaction.begin();
			
			vehicl.setName("Baleno");
			charcy.setType("WRC");
			
			entityManager.merge(vehicl);
			
			entityTransaction.commit();
		} else {
			System.out.println("No data to update");
		}
	
	}
}
