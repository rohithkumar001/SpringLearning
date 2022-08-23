package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		City city = con.getBean("city", City.class);
		city.setId(01);
		city.setName("Hyderabad");
		
		State st = con.getBean("state", State.class);
		st.setName("Telangana");
		city.setS(st);
		city.showCityDetails();

	}

}
