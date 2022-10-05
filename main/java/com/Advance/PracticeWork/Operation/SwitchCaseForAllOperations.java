package com.Advance.PracticeWork.Operation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.Entity.Product;
import com.Restrictions.Restrictionsuse;

public class SwitchCaseForAllOperations {

	public static void main(String[] args) {

		AllOperations allOperation = new AllOperations();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter choice 1.fetch data ,2.save, 3.delete");
		int choice = Integer.parseInt(bufferedReader.readLine());
		while(true) {
			
		
		case 1 :
	
		int ProductId = scanner.nextInt();
	Product product =allOperation.GetMethod(ProductId);
	System.out.println(product);
	

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
		case 2:
		// data delete
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
