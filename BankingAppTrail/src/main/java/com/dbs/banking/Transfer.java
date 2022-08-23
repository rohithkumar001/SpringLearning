package com.dbs.banking;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transfer {
	@Id
	private int custid;
	private int amount;
	
	public Transfer() {
		super();
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + custid;
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
		Transfer other = (Transfer) obj;
		if (amount != other.amount)
			return false;
		if (custid != other.custid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Transfer [custid=" + custid + ", amount=" + amount + "]";
	}
	

}
