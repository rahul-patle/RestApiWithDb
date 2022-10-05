package com.Advance.PracticeWork.Configure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Product;

public class Configure2 {

// ? represents any type of class as a type
		public  SessionFactory  getSessionFactoryObject (Class<?> student) {

			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(student);
			SessionFactory factory = configuration.buildSessionFactory();
			return factory;
			
		}
}
          