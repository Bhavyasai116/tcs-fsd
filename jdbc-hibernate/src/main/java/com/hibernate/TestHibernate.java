package com.hibernate;
import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;



public class TestHibernate {
	public static void main(String[] args) {
		Configuration configure=new Configuration();
		configure=configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		System.out.println(factory);
		Session session=factory.openSession();
		System.out.println(session);
		Transaction transaction=session.beginTransaction();
		//fetch multiple rows
		Query<Employee> query=session.createQuery("select e from Employee e");
		List<Employee> list= query.list();
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//fetch a row from DB
//		Employee emp=session.get(Employee.class, 1);
//		emp.setSal(70000);
//		session.update(emp);
		
		//delete a row from db
//		Employee emp=session.get(Employee.class, 4);
//		session.delete(emp);
//		
//		
//		
//		System.out.println(emp);
//		Employee emp=new Employee();
//		emp.setEname("Sri");
//		emp.setSal(60000);
//		session.save(emp);
		transaction.commit();
		session.close();
	}
	

}
