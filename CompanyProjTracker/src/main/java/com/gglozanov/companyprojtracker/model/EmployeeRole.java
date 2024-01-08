package com.gglozanov.companyprojtracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_role")
public class EmployeeRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    // Getters and setters, constructors, other methods
}