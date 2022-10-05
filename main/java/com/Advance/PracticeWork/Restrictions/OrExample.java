package com.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.Configure.Configure;
import com.Entity.Product;

public class OrExample {

	public static void main(String[] args) {
		Configure configure = new Configure();
		SessionFactory sessionfatory = configure.getSessionFactoryObject();
		Session session = sessionfatory.openSession();

		Class<Product> obj = Product.class; // class object
		Criteria criteria = session.createCriteria(obj); // class object

		Criterion name = Restrictions.eq("productName", "Booklet");
		Criterion price = Restrictions.eq("productPrice", 30d);

		Criterion criterion = Restrictions.or(name, price);

		criteria.add(name);

		List<Product> list = criteria.list();

		for (Product product : list) {
			System.out.println(product);
		}
	}

}
