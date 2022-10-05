package com.Projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.Configure.Configure;
import com.Entity.Product;

public class ProjectionByWhereExample2 {

	// example on inner queries

	// Print product where

	// create sessionfactory object
	Configure configure = new Configure();
	SessionFactory sessionfactory = configure.getSessionFactoryObject();
	

	public List<Product> getMaxProduct() {
		
	
		Session session = sessionfactory.openSession();
		double max = 0;
		List<Product> list1 = null;
		try {

			Criteria criteria1 = session.createCriteria(Product.class);
			criteria1.setProjection(Projections.max("productprice"));
			// select  *
			List list = criteria1.list();
			//max at get [0] index
			max = (Double) list.get(0);

			
			 // Each operation  new session  object required

			
			Criteria criteria2 = session.createCriteria(Product.class);
		// productprice=max;
			Criterion critrion = Restrictions.eq("productprice", max);
			// add== where
			criteria2.add(critrion);

			list1 = criteria2.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return list1;

	}

	
	
	
	
	
	
	
	
	
}
