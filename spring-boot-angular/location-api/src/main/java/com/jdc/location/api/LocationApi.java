package com.jdc.location.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.location.api.dto.Location;
import com.jdc.location.model.entity.Division;
import com.jdc.location.model.repo.DivisionRepo;
import com.jdc.location.model.repo.TownshipRepo;

@RestController
@RequestMapping("locations")
public class LocationApi {

	@Autowired
	private DivisionRepo divisions;
	
	@Autowired
	private TownshipRepo townships;
	
	@GetMapping
	public List<Division> index() {
		return divisions.findAll();
	}
	
	@GetMapping("{id}")
	public Location findById(int id) {
		Location loc = new Location();
		loc.setDivision(divisions.findById(id).orElse(null));
		loc.setTownships(townships.findByDivisionId(id));
		return loc;
	}
}
