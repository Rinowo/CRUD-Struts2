package org.example.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;

	public static SessionFactory getFactory(){

		if (factory == null) {
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties());
			factory = configuration.buildSessionFactory(builder.build());
			return factory;
		}
		else
			return factory;

	}

	public static Session getSession(){
		getFactory();
		return factory.openSession();
	}

	public static boolean persist(Object x){
		try {
			Session session = getSession(); // Nova Sessao
			
			session.beginTransaction();
			
			session.persist(x);

			session.getTransaction().commit();
			session.flush();
			session.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}

}
