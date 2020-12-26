package com.jdc.words.settings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.jdc.spring.jwt.services.JwtTokenFilter;

@EnableWebSecurity
public class ExamAppSecuritySetting extends WebSecurityConfigurerAdapter{

	@Autowired
	private JwtTokenFilter filter;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	}
}
