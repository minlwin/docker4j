package com.jdc.embedded.trigger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextTrigger implements ServletContextListener{
	
	private EntityManagerFactory emf;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		emf = Persistence.createEntityManagerFactory("customer-jpa");
		sce.getServletContext().setAttribute("emf", emf);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		if(null != emf && emf.isOpen()) {
			emf.close();
		}
	}
}
