package com.DriverMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.hibernate.lob.ReaderInputStream;

import com.Entity.Product;
import com.Restrictions.Restrictionsuse;
import com.operation.AllOperations;
import com.operation.GetAllData2;

public class Test {

	public static void main(String[] args) throws Exception {   // NOT  CHANGED

		AllOperations allOperation = new AllOperations();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		// data fetched
//		System.out.println("enter productId");
//		int ProductId = scanner.nextInt();
//		Product product =allOperation.GetMethod(ProductId);
//		System.out.println(product);
////	

		// data save
//		
//			System.out.println("enter productId");
//			int ProductId = Integer.parseInt(bufferedReader.readLine());
//			
//			System.out.println("enter ProductName");
//			
//			String ProductName = bufferedReader.readLine()	;		
//			
//			System.out.println("enter productQuantity"); 
//			
//			 int  productQuantity = Integer.parseInt(bufferedReader.readLine());	
//			System.out.println("enter productprice");
//			
//			 double productprice = Double.parseDouble(bufferedReader.readLine());	
//			
//			
//			Product product = new Product(ProductId, ProductName, productQuantity, productprice);
//				
//			allOperation.saveData(product);
//		
		/////////////////////////////////////////////////////////////////////////////////////////////////////

//			// data delete
//		
//		
//		allOperation.deletedata(4);

		// update delete
////		Product product  = new Product (3,"table",20,50);
//
//		allOperation.updateMethod(product);

//		// data insert
//		GetAllData2 insert = new GetAllData2();
//		insert.insertData();

	
	}
}
