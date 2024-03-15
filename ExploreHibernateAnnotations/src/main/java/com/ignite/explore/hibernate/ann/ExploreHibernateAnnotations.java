package com.ignite.explore.hibernate.ann;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class ExploreHibernateAnnotations {

	public static void main(String[] args) {
		StandardServiceRegistry reg = new StandardServiceRegistryBuilder().build();
		
		SessionFactory sFactory = new MetadataSources(reg).addAnnotatedClass(Employee.class)
															.buildMetadata()
															.buildSessionFactory();
		Session ses = sFactory.openSession();
		Transaction txn = ses.beginTransaction();
		
		Employee syam = new Employee();
		syam.setName("Dileep");
		syam.setDesignation("Software Engr");
		
		ses.save(syam);
		
		txn.commit();
		ses.close();
		
		
	}
}
