package com.Advance.PracticeWork.Configure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Product;

public class Configure {


		public  SessionFactory  getSessionFactoryObject () {

			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Product.class);
			SessionFactory factory = configuration.buildSessionFactory();
			return factory;
			
		}

	
}
