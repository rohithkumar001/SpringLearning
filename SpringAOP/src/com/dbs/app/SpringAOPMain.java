package com.dbs.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPMain {
	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("spring-config.xml");
		BusinessLogic bl = (BusinessLogic)con.getBean("businesslogic");
		bl.getBusinessLogic();
		
		
	}
}
