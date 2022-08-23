package com.dbs;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainApp {

    public static void main(String[] args) { 
        SessionFactory sf =  new Configuration().configure().buildSessionFactory();

        org.hibernate.Session session = sf.openSession();

        List<Book> books=session.createQuery("FROM Book").list();
        Transaction transaction = session.beginTransaction();
        
       
        
        Book book = new Book();
        book.setAuthor("Ronald Dahl");
        book.setTopic("Poison");
        
        
        session.save(book);
        transaction.commit();
        for(Book b: books) {System.out.println(b);}
        session.close();
        sf.close();
    }

}