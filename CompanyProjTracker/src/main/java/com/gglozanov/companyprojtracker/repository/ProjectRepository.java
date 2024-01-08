package com.gglozanov.companyprojtracker.repository;

import com.gglozanov.companyprojtracker.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    // Retrieve project by project name
    Project findByProjectName(String projectName);
}