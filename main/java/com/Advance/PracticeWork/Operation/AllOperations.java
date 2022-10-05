package com.Advance.PracticeWork.Operation;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Configure.Configure;
import com.Entity.Product;

      public class AllOperations {

	Configure opration = new Configure();
	SessionFactory factory = opration.getSessionFactoryObject();
	Session session = null;

	public Product GetMethod(int ProductId) {
	//	Product product = new Product();
		session = factory.openSession();
		// assign Product ;
		Product pd = session.get(Product.class, ProductId);
		return pd;

	}

	public void saveData(Product product) {

		try {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(product);
			System.out.println(product);
			transaction.commit();
			System.out.println("data saved");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (session !=null) 
			session.close();	
		
			}
	}

	public void deletedata(int productId) {
		try {
			Session session = factory.openSession();
			Product product = session.get(Product.class, productId);
			Transaction transaction = session.beginTransaction();
			session.delete(product);
			// System.out.println(product);
			transaction.commit();
			System.out.println("data deleted");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

	public void updateMethod(Product product) { 
		//Product product = new Product(2, "pencil", 30, 40);
		try {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(product);
			System.out.println(product);
			transaction.commit();
			System.out.println("data updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (session !=null) {
				session.close();
			}
		}
		
		
	}

}
