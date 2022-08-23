package com.dbs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lets establish the connection
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		//open a session
		Session session = sf.openSession();
		
		//begin transaction
		Transaction transaction =session.beginTransaction();
		
		//instansiate books
		Book book=new Book();
		book.setAuthor("Ronald Dahl");
		book.setTopic("Poison");
		
		//lets save it permanently
		transaction.commit();
		session.close();
		sf.close();
	}

}
