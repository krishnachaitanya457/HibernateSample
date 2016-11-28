package com.business;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.model.UserDetails;
public class MainApp {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("suresh.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
	   Session session=sessionFactory.openSession();
	        Transaction transaction=session.beginTransaction();
	        UserDetails details=new UserDetails();
	        details.setUserName("suresh");
	        details.setPassword("*******");
	        session.save(details);
	        transaction.commit();
	        session.close();
	}
    }