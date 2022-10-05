package com.Restrictions;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Configure.Configure;
import com.Entity.Product;

public class SaveArraylist {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		conf.addAnnotatedClass(Product.class);
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		List<Product> arraylist = new ArrayList<Product>();
// used constructor without id because use of autogeneration
		// if not then use constructor with id
		arraylist.add(new Product(13, "laptop", 20, 30));
		arraylist.add(new Product(14, "liscence", 40, 70));
		arraylist.add(new Product(15, "booklet", 30, 50));

		for (Product products : arraylist) {

			session.save(products);
		}
		transaction.commit();
		System.out.println("data saved");
	}
}
