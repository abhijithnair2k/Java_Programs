package org.abhi.DemoHib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("Abhijith");
		e.setDesg("java dev");
		e.setSalary(43000);
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		System.out.println("4");
		s.save(e);
		System.out.println("5");
		Transaction t = s.beginTransaction();
		t.commit();
		System.err.println("uytj6r6vcrtcnvrd");
	}
}
