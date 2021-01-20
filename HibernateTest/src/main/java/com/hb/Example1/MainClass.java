package com.hb.Example1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session ses = sf.openSession();
	Employee e1 = new Employee();
	e1.setName("Virat Kohli");
	e1.setAge(33);
	e1.setId(1);
	Transaction tx = ses.beginTransaction();
	ses.update(e1);;
	tx.commit();
	ses.close();
	sf.close();
}
}
