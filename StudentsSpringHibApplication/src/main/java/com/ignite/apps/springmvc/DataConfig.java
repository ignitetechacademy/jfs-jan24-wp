package com.ignite.apps.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataConfig {

	@Bean
	LocalSessionFactoryBean createFactory() {
		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
		sfb.setPackagesToScan("com.ignite.apps.springmvc");
		sfb.setConfigLocation(new ClassPathResource("std-hibernate-config.xml"));

		return sfb;
	}

	@Bean
	HibernateTransactionManager txnManager() {
		HibernateTransactionManager txMgr = new HibernateTransactionManager();
		txMgr.setSessionFactory(createFactory().getObject());

		return txMgr;
	}

}
