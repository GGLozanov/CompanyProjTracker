package com.gglozanov.companyprojtracker.repository;

import com.gglozanov.companyprojtracker.model.EmployeeRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<EmployeeRole, Long> {
}