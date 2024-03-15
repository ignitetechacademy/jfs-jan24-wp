package com.ignite.explore.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ignite.explore.hibernate.Bank;

public class ExploreHibernateUsingXML {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Bank bankInfo = new Bank();
		bankInfo.setBid(103);
		bankInfo.setName("UTI Bank");
		bankInfo.setHeadQuarters("Kolkata");

		session.save(bankInfo);

		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
