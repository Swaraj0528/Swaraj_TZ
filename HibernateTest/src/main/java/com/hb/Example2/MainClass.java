package com.hb.Example2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.Example1.Employee;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();
		Store s1 = new Store();
		s1.setItemId(1011);
		s1.setItemName("Kurkure");
		s1.setPrice(15.20);
		Transaction tx = ses.beginTransaction();
		ses.save(s1);;
		tx.commit();
		ses.close();
		sf.close();
	}

}
