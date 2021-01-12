package com.java;
import java.util.*;
import org.hibernate.* ;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class HibernateUtilMappingTest {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Marque marque = new Marque("Renault");
		Voiture v1 = new Voiture("Megane","1-9999", marque);
		Voiture v2 = new Voiture("Clio","1-99989", marque);
		Set<Voiture> voitures = new HashSet<Voiture>();
		voitures.add(v1);
		voitures.add(v2);
		marque.setVs(voitures);
		session.save(marque);
		session.getTransaction().commit();
		session.close();
		

	}

}
