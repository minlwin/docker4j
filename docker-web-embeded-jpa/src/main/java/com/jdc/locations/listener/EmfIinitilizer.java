package com.jdc.locations.listener;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class EmfIinitilizer implements ServletContextListener{
	
	private EntityManagerFactory emf;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		emf = Persistence.createEntityManagerFactory("locations");
		sce.getServletContext().setAttribute("emf", emf);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		emf.close();
	}
}
