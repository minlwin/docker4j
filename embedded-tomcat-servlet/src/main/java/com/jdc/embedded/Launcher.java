package com.jdc.embedded;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

public class Launcher {

	public static void main(String[] args) {
		try {
			String base = args.length == 0 ? new File("embedded").getAbsolutePath() : args[0];
			new Launcher().launch(base);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void launch(String tomcatBase) throws Exception{
		
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		tomcat.setConnector(tomcat.getConnector());
		
		Context context = tomcat.addWebapp("", tomcatBase);
		Tomcat.addServlet(context, "hello", new HelloServlet());
		context.addServletMappingDecoded("/hello", "hello");
		
		tomcat.start();
		tomcat.getServer().await();
		
	}
}
