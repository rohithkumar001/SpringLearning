import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import hibernate_mapping.model.Employee;
import hibernate_mapping.model.Laptop;
import hibernate_mapping.model.Project;
import hibernate_mapping.model.Phone;
import jakarta.transaction.Transaction;

public class OnetoOneMain {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		org.hibernate.Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		
		Laptop laptop = new Laptop();
		laptop.setCpu("i3");
		laptop.setRam("8GB");
		
		Laptop laptop1 = new Laptop();
		laptop1.setCpu("i7");
		laptop1.setRam("16GB");
		
		Project proj = new Project(1,"Banking App");
		Phone phone=new Phone("9938672381");
		Phone phone1=new Phone("8866237819");
		Phone phone2=new Phone("9467451290");
		Phone phone3=new Phone("8856447790");
		
		 ArrayList<Phone> list1=new ArrayList<Phone>();    
		    list1.add(phone);    
		    list1.add(phone1);    
		 ArrayList<Phone> list2=new ArrayList<Phone>();    
		    list2.add(phone2);    
		    list2.add(phone3);    
		
		Employee employee = new Employee();
		employee.setName("Dr Tarakeshwar");
		employee.setLaptop(laptop);
		employee.setProject(proj);
		employee.setPhone(list1);
		
		Employee employee1 = new Employee();
		employee1.setName("Mr Bandenawaaz");
		employee1.setLaptop(laptop1);
		employee1.setProject(proj);
		employee1.setPhone(list2);
		
		phone.setEmployee(employee);
		phone1.setEmployee(employee);
		phone2.setEmployee(employee1);
		phone3.setEmployee(employee1);
		session.save(laptop);
		session.save(employee);
		session.save(laptop1);
		session.save(employee1);
		transaction.commit();
		session.close();
		factory.close();
	}
}
