package com.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Configure.Configure;
import com.Entity.Product;

public class CriteriaUse {

	public static void main(String[] args) {

		Product product = new Product();
		Configure opration = new Configure();
		SessionFactory factory = opration.getSessionFactoryObject();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		criteria.setFirstResult(6);
		// starting point from which result fetched
		// Filteredout on list is called pagination
		List<Product> arraylist = criteria.list();

		for (Product product2 : arraylist) {
			System.out.println(product2);
		}

	}

}
