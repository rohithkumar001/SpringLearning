package com.dbs.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringIOC {
	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("NewFile.xml");
	
		Laptop l = (Laptop)con.getBean("Laptop");
		Person p = (Person)con.getBean("Person");
	}
}
