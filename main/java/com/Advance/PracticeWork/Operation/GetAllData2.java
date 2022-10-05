package com.Advance.PracticeWork.Operation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.Configure.Configure;
import com.Configure.Configure2;
import com.Entity.Product;
import com.Entity.Student;

import sun.font.CreatedFontTracker;

public class GetAllData2 {
	Configure2 opration = new Configure2();

// session factory is universal 	
	SessionFactory factory = opration.getSessionFactoryObject(Student.class);

// but session is new requires for each operation;
	public void insertData() {
		Student student = new Student(4, "vitt", 20, 30);
		Session session = null;

		try {
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(student);
			System.out.println(student);
			transaction.commit();
			System.out.println("data inserted");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

	}
}


	
