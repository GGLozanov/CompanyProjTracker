package com.gglozanov.companyprojtracker.repository;

import com.gglozanov.companyprojtracker.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    // Retrieve project by project name
    Project findByProjectName(String projectName);

    @Query("SELECT p FROM Project p WHERE p.isActive = 1")
    List<Project> findActiveProjects();
}