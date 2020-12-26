package com.jdc.words.settings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.jdc.spring.jwt.JwtConfiguration;
import com.jdc.spring.jwt.JwtSettings;

@Configuration
public class ExamAppJwtSetting implements JwtConfiguration{

	@Value("${app.jdc.thorn.jwt.name}")
	protected String tokenName;
	@Value("${app.jdc.thorn.jwt.issuer}")
	protected String issuer;
	@Value("${app.jdc.thorn.jwt.minutes}")
	protected int lifeTimeInMinutes;

	@Override
	public JwtSettings settings() {
		return new JwtSettings() {
			
			@Override
			public String tokenName() {
				return tokenName;
			}
			
			@Override
			public int lifeTimeInMinutes() {
				return lifeTimeInMinutes;
			}
			
			@Override
			public String issuer() {
				return issuer;
			}
		};
	}
}
