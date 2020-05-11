package br.com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * 
 * @author PedroMiquiles
 *
 *  
 */


public class JPAUtil {
	
	private static EntityManagerFactory factory;
	
	static {
		 
		if (factory == null) {
		
		factory = Persistence.createEntityManagerFactory("dblivraria");
		
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	public static Object getPrimaryKey(Object entity) {
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
		
	}
	

}
