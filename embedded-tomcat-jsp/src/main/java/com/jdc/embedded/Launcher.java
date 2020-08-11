package com.jdc.embedded;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

import com.jdc.embedded.controller.CustomerServlet;
import com.jdc.embedded.controller.LocalTimeServlet;

public class Launcher {
	
	public static void main(String[] args) {
		
		try {
			new Launcher().launch();
		} catch (Exception e) {
			e.getSuppressed();
		}
		
	}
	
	void launch() throws Exception {
		
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		tomcat.setConnector(tomcat.getConnector());
		
		File docBase = new File("base");
		
		Context context = tomcat.addWebapp("", docBase.getAbsolutePath());
		context.setAddWebinfClassesResources(true);
		
		context.addApplicationListener("com.jdc.embedded.trigger.ContextTrigger");

		Tomcat.addServlet(context, "currentTime", new LocalTimeServlet());
		context.addServletMappingDecoded("/current-time", "currentTime");
		
		Tomcat.addServlet(context, "customers", new CustomerServlet());
		context.addServletMappingDecoded("/customers", "customers");
		
		tomcat.start();
		tomcat.getServer().await();
		
	}
}
