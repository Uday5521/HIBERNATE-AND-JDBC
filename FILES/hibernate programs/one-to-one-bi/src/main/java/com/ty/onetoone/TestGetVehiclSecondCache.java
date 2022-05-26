package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetVehiclSecondCache {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Vehicl vehicl = entityManager.find(Vehicl.class, 5);
		
		System.out.println("Vehicl name : "+vehicl.getName());
		System.out.println("Vehicl cost : "+vehicl.getCost());
		
		
		Charcy charcy = vehicl.getCharcy();
		System.out.println("Charcy number : "+charcy.getCharcyNumber());
		System.out.println("----------------------------------------------------");
		
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		
		Vehicl vehicl2 = entityManager2.find(Vehicl.class, 5);
		
		System.out.println("Vehicl name : "+vehicl2.getName());
		System.out.println("Vehicl cost : "+vehicl2.getCost());
		
		
		Charcy charcy2 = vehicl2.getCharcy();
		System.out.println("Charcy number : "+charcy2.getCharcyNumber());
		
		
		
		
	}
}
