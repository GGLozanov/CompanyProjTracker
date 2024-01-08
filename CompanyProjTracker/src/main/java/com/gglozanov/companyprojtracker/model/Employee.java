package com.gglozanov.companyprojtracker.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects = new HashSet<>();

    public Employee() {
        this(0L, "GRISHO");
    }

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters, constructors, other methods

    public String getName() {
        return name;
    }
}