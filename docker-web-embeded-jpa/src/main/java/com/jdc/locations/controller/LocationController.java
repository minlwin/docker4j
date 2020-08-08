package com.jdc.locations.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdc.locations.model.entity.Township;
import com.jdc.locations.model.service.LocationService;

@WebServlet("/locations")
public class LocationController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private LocationService service;
	
	@Override
	public void init() throws ServletException {
		EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
		service = new LocationService(emf.createEntityManager());
		getServletContext().setAttribute("divisions", service.getDevisions());;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String str = null;
		int id = (str = req.getParameter("id")) == null ? 1 : Integer.parseInt(str);
		
		List<Township> townships = service.findByDivision(id);
		req.setAttribute("townships", townships);
		req.setAttribute("division", service.findDivisionById(id));
		
		getServletContext().getRequestDispatcher("/location.jsp").forward(req, resp);
	}
}
