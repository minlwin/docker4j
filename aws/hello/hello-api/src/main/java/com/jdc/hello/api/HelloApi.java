package com.jdc.hello.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.hello.model.Hello;
import com.jdc.hello.model.HelloRepo;

@RestController
@RequestMapping("api/hellos")
public class HelloApi {

	@Autowired
	private HelloRepo repo;
	
	@GetMapping
	public List<Hello> index() {
		return repo.findAll();
	}
	
	@PostMapping
	public Hello create(@RequestBody Hello hello) {
		return repo.save(hello);
	}
}
