package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.sample;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		System.out.println("cfg is ready" + cfg);
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("session factory is ready");
		Session s = sf.openSession();
		sample s1 = new sample();
		s1.setId(11);
		s1.setName("laxmi");
		sample s2 = new sample();
		s2.setId(22);
		s2.setName("rohit");
		Transaction tr = s.beginTransaction();
		s.save(s1);
		s.save(s2);
		tr.commit();
		s.close();
		System.out.println("object save");

	}
}
