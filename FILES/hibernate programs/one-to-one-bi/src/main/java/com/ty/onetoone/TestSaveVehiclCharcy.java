package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehiclCharcy {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicl vehicl = new Vehicl();
		vehicl.setName("S-cross");
		vehicl.setCost(20000);
		
		Charcy charcy = new Charcy();
		charcy.setCharcyNumber("IND99UI11345KA");
		charcy.setType("Rally");
		
		vehicl.setCharcy(charcy);
		
		entityTransaction.begin();
		
		entityManager.persist(vehicl);
		entityManager.detach(vehicl);;
		vehicl.setName("Dimple2");
		entityManager.merge(vehicl);
		entityTransaction.commit();
	}
}
