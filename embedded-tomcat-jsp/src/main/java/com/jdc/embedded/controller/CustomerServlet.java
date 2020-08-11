package com.jdc.embedded.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdc.embedded.model.Customer;
import com.jdc.embedded.model.CustomerModel;

public class CustomerServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private CustomerModel model;
	
	@Override
	public void init() throws ServletException {
		EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
		model = new CustomerModel(emf.createEntityManager());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Customer> list = model.getAll();
		req.setAttribute("list", list);
		getServletContext().getRequestDispatcher("/customers.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		
		Customer c = new Customer();
		c.setName(name);
		c.setPhone(phone);
		c.setEmail(email);
		
		model.save(c);
		
		resp.sendRedirect(req.getServletPath());
	}
}
