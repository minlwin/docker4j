package com.jdc.hello.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepo extends JpaRepository<Hello, Integer>{

}
