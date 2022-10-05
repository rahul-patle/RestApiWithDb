package com.Advance.PracticeWork.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
 @ Id
 //@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
private   int productId ;
private   String productName;
private   int productQuantity;
private   double productprice;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productQuantity, double productprice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productprice = productprice;
	}
	
	public Product( String productName, int productQuantity, double productprice) {
		super();
		
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productprice = productprice;
	}
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productprice=" + productprice + "]";
	}

	
}
