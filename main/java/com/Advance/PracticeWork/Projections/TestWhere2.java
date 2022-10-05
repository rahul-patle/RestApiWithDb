package com.Projections;

import java.util.List;
import java.util.Scanner;

import com.Entity.Product;

public class TestWhere2 {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
		
				System.out.println("enter choice 1.max , 2.exit");
				int choice = scanner.nextInt();
				
			switch (choice) {
			case 1:
				ProjectionByWhereExample2 ex = new ProjectionByWhereExample2();

				List<Product> list = ex.getMaxProduct();

				System.out.println(list);
				break;
			case 2:
				 System.exit(0);
			}
		}
	}
}
