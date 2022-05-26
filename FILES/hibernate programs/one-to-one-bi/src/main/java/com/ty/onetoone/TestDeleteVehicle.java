package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteVehicle {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicl vehicl = entityManager.find(Vehicl.class, 3);
		System.out.println(vehicl);
		if(vehicl != null) {
			
			entityTransaction.begin();
			
			entityManager.remove(vehicl);
			
			entityTransaction.commit();
			
		} else {
			System.out.println("Sorry no data to delete");
		}
		
		
	}
}
