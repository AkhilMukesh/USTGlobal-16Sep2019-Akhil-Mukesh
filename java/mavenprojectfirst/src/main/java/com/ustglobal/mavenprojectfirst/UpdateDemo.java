package com.ustglobal.mavenprojectfirst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobsl.jpawithhibernateapp.dto.CompanyInfo;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();
			CompanyInfo companyInfo = entityManager.find(CompanyInfo.class, 2);
			companyInfo.setCname("UST Global");
			System.out.println("Record Updated");

			entityTransaction.commit();
			entityManager.close();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}

		entityManager.close();

	}

}
