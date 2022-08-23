package com.dbs.banking;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	private int customerid;
	private int balance;
	public int amt;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getBalance() {
		return balance+amt;
	}
	public void setBalance(int balance) {
		this.balance = balance+amt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + customerid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (balance != other.balance)
			return false;
		if (customerid != other.customerid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", balance=" + balance + "]";
	}
	
	
	
	
}
