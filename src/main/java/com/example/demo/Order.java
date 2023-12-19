package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {

	private int oid;
	private String status;
	
	@Autowired
	private product prod;
	
	

	@Autowired
	private Discount discount;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public product getProd() {
		return prod;
	}
	public void setProd(product prod) {
		this.prod = prod;
	}

	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", status=" + status + ", prod=" + prod + ", discount=" + discount + "]";
	}
	
}
