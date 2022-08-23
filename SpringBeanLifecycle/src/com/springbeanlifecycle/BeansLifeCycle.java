package com.springbeanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansLifeCycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService)applicationContext.getBean("personService");
		System.out.println("Name: "+personService.getPerson().getName());
		UserService userService = (UserService)applicationContext.getBean("userService");
		System.out.println("Name: "+userService.getUser().getName());
		
		applicationContext.registerShutdownHook();
	}
}
