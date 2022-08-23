package com.dbs.mappingdemo.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		User user2 = new User();
		
		user.setUserName("sunil");
		user2.setUserName("Anand");
		
		Address address = new Address();
		address.setStreet("Gachibowli");
		address.setCity("Hyderabad");
		
		Address address2= new Address();
		address2.setStreet("Hitec city");
		address2.setCity("Hyderabad");
		
		Vehicle car= new Vehicle();
		car.setName("audi");
		
		Vehicle jeep= new Vehicle();
		jeep.setName("Compass");
		
		Vehicle bike = new Vehicle();
		bike.setName("Hayabusa");
		
		Vehicle cycle = new Vehicle();
		cycle.setName("KTM");
		
		Mobile sony=new Mobile();
		sony.setBrand("Sony");
		sony.setModel("Xperia Z3");
		
		Mobile iphone = new Mobile();
		iphone.setBrand("apple");
		iphone.setModel("Iphone 13 pro max");
		
		Mobile oneplus = new Mobile();
		oneplus.setBrand("oneplus");
		oneplus.setModel("Oneplus 10pro");
		
		Mobile nothing = new Mobile();
		nothing.setBrand("Nothing");
		nothing.setModel("Phone 1");
		
		user.setAddress(address);
		user2.setAddress(address2);
		address.setUser(user);
		address2.setUser(user2);
		
		user.getMobile().add(sony);
		user2.getMobile().add(iphone);
		sony.getUser().add(user);
		iphone.getUser().add(user2);
		
		user.getVehicle().add(car);
		user2.getVehicle().add(bike);
		car.getUser().add(user);
		bike.getUser().add(user2);
		
		user.getVehicle().add(jeep);
		jeep.getUser().add(user);
		user2.getVehicle().add(cycle);
		cycle.getUser().add(user2);
		
		//lets add data to database
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
	}

}
