package com.dbs.banking;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Customer customer = new Customer();
		customer.setCustomerid(101);
	customer.setBalance(12000);
//		
		Transfer transfer = new Transfer();
		transfer.setCustid(101);
		transfer.setAmount(15000);
		customer.setBalance(customer.getBalance()+transfer.getAmount());
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(customer);
		session.save(transfer);
		session.getTransaction().commit();
		session.close();
	}

}
