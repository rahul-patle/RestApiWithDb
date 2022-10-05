package com.Advance.PracticeWork.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
 @ Id
private   int stId ;
private   String sttName;
private   int stQuantity;
private   int stprice;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stId, String sttName, int stQuantity, int stprice) {
		super();
		this.stId = stId;
		this.sttName = sttName;
		this.stQuantity = stQuantity;
		this.stprice = stprice;
	}

	public int getProductId() {
		return stId;
	}

	public void setProductId(int stId) {
		this.stId = stId;
	}

	public String getProductName() {
		return sttName;
	}

	public void setProductName(String sttName) {
		this.sttName = sttName;
	}

	public int getProductQuantity() {
		return stQuantity;
	}

	public void setProductQuantity(int stQuantity) {
		this.stQuantity = stQuantity;
	}

	public int getProductprice() {
		return stprice;
	}

	public void setProductprice(int productprice) {
		this.stprice = stprice;
	}

	@Override
	public String toString() {
		return "Product [stprice=" + stprice + ", sttName=" + sttName + ", stQuantity="
				+ stQuantity + ", stprice=" + stprice + "]";
	}

	
}
