package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = new Mobile();
		mobile.setName("Sony");
		mobile.setCost(20000);
		
		Sim sim1 = new Sim();
		sim1.setProvider("Airtel");
		sim1.setType("3G");
		sim1.setImei("AIR99PL678");
		
		Sim sim2 = new Sim();
		sim2.setProvider("BSNL");
		sim2.setType("4G");
		sim2.setImei("BNL23PM645");
		
		sim1.setMobile(mobile);
		sim2.setMobile(mobile);
		
		List<Sim> sims = new ArrayList<Sim>();
		sims.add(sim1);
		sims.add(sim2);
		
		mobile.setSim(sims);
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
		
	}
}



















