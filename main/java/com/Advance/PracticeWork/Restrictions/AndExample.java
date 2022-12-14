package com.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.Configure.Configure;
import com.Entity.Product;

public class AndExample {

	public static void main(String[] args) {
		Configure configure = new Configure();
		SessionFactory sessionfatory = configure.getSessionFactoryObject();
		Session session = sessionfatory.openSession();

		Class<Product> obj = Product.class;				// class object
		Criteria criteria = session.createCriteria(obj); // class object

		//productName = booklet
		// productpPrice= 30
		Criterion name = Restrictions.eq("productName", "Booklet");
		Criterion price = Restrictions.eq("productprice", 30d);

		// name and price
		Criterion criterion = Restrictions.and(name, price);

		criteria.add(name);
       //select *
		List<Product> list = criteria.list();

		for (Product product : list) {
			System.out.println(product);
		}
	}
}
