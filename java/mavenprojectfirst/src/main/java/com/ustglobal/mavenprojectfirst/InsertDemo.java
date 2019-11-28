package com.ustglobal.mavenprojectfirst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobsl.jpawithhibernateapp.dto.CompanyInfo;

public class InsertDemo {
	public static void main(String[] args) {

		CompanyInfo companyInfo = new CompanyInfo();
		companyInfo.setId(1);
		companyInfo.setCname("Google");
		companyInfo.setClocation("California");

		/*
		 * companyInfo.setId(2); companyInfo.setCname("Amazon");
		 * companyInfo.setClocation("Washington");
		 */

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();


			entityTransaction.begin();
			entityManager.persist(companyInfo);
			System.out.println("Inserted data");
			entityTransaction.commit();
			entityManager.close();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

		entityManager.close();




	}
}