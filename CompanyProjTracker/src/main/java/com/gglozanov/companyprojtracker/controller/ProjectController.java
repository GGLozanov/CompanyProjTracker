package com.gglozanov.companyprojtracker.controller;

import com.gglozanov.companyprojtracker.model.Project;
import com.gglozanov.companyprojtracker.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/projects")
    public String getAllProjects() {
        Iterable<Project> projects = projectRepository.findAll();
        return projects.toString();
    }

    @GetMapping("/active_projects")
    public String getAllActiveProjects() {
        return "";
    }
}
