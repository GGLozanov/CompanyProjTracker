package com.gglozanov.companyprojtracker.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    private Boolean isActive;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    public Project() {
      this(0L, "asd", true, new HashSet<>());
    }

    public Project(Long id, String projectName, boolean isActive, Set<Employee> employees) {
        this.id = id;
        this.projectName = projectName;
        this.isActive = isActive;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "(Project name: " + projectName + "; is Active: " + isActive + ")";
    }

    // Getters and setters, constructors, other methods
    public String getProjectName() {
        return projectName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Task getTask() {
        return task;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }
}
