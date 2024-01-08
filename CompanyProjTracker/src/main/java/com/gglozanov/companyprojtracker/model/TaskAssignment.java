package com.gglozanov.companyprojtracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "task_assignment")
public class TaskAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    // Getters and setters, constructors, other methods
}