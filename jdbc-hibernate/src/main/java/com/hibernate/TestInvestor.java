package com.hibernate;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class TestInvestor {
	public static void main(String[] args) {
		Configuration configure=new Configuration();
		configure=configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		//System.out.println(factory);
		Session session=factory.openSession();
		//System.out.println(session);
		Transaction transaction=session.beginTransaction();
		
		
		
		
		//fetch a row from DB
//		Employee emp=session.get(Employee.class, 1);
//		emp.setSal(70000);
//		session.update(emp);
		
		//delete a row from db
//		Employee emp=session.get(Employee.class, 4);
//		session.delete(emp);
//		
		
		
		//System.out.println(inv);
		Investor inv=new Investor();
		inv.setName("Ross");
		inv.setAmount(40000);
		inv.setAddress("Hyderabad");
		session.save(inv);
		transaction.commit();
		session.close();
	}
	

}
