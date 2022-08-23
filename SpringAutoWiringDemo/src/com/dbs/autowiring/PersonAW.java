package com.dbs.autowiring;

public class PersonAW {
	CarAW car;
	AddressAW add;
	

	public PersonAW(CarAW car) {
		super();
		this.car = car;
		System.out.println("Car: "+car);
	}

	public CarAW getCar() {
		return car;
	}

	public void setCar(CarAW car) {
		this.car = car;
	}

	public AddressAW getAdd() {
		return add;
	}

	public void setAdd(AddressAW add) {
		this.add = add;
	}
	
	
	
}
