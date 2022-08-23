package com.dbs.testing;

public class Laptop {

	private int lid;
	private String model;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Laptop [lid="+lid+",model="+model+"]";
	}

}
