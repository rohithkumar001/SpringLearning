package com.springbeanlifecycle;

public class PersonService {
	private Person person;
	public PersonService() {
		System.out.println("PersonService no-arg constructor");
	}
	public void customInit() {
		System.out.println("customInit() called");
	}
	public void customDestroy() {
		if(!person.getName().equals("Raj")) {
			person.setName("Raj");
		}
		System.out.println("customDestroy() called, closing opened resources");
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
