package com.gglozanov.companyprojtracker.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roleName;

    @OneToMany(mappedBy = "role")
    private Set<EmployeeRole> employeeRoles = new HashSet<>();

    // Getters and setters, constructors, other methods

}