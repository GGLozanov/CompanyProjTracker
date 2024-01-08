package com.gglozanov.companyprojtracker.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;

    @OneToMany(mappedBy = "task")
    private Set<Project> projects = new HashSet<>();

    // Getters and setters, constructors, other methods
}