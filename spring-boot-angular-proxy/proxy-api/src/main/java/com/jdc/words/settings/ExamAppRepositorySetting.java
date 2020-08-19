package com.jdc.words.settings;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jdc.words.model.BaseRepositoryImpl;

@Configuration
@EnableJpaRepositories(basePackages = "com.jdc.words.model.repo", repositoryBaseClass = BaseRepositoryImpl.class)
public class ExamAppRepositorySetting {

}
