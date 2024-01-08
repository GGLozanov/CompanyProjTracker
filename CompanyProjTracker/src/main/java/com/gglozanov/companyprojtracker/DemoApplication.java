package com.gglozanov.companyprojtracker;

import com.gglozanov.companyprojtracker.controller.ProjectController;
import com.gglozanov.companyprojtracker.model.Project;
import com.gglozanov.companyprojtracker.repository.ProjectRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.gglozanov.companyprojtracker.*")
@EntityScan("com.gglozanov.companyprojtracker.*")
@ComponentScan(basePackageClasses = { ProjectRepository.class, ProjectController.class, Project.class, DataLoader.class })
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
