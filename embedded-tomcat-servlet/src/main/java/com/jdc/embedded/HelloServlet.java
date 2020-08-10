package com.jdc.embedded;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("<html>");
		resp.getWriter().append("<head>");
		resp.getWriter().append("<title>");
		resp.getWriter().append("Embedded Servlet");
		resp.getWriter().append("</title>");
		resp.getWriter().append("</head>");
		resp.getWriter().append("<body>");
		resp.getWriter().append("<h1>");
		resp.getWriter().append("Hello Servlet from Embedded Tomcat");
		resp.getWriter().append("</h1>");
		resp.getWriter().append("</body>");
		resp.getWriter().append("</html>");
	}
}
