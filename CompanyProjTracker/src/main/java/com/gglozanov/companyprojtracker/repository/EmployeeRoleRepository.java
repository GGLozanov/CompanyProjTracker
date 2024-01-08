package com.gglozanov.companyprojtracker.repository;

import com.gglozanov.companyprojtracker.model.EmployeeRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRoleRepository extends CrudRepository<EmployeeRole, Long> {
}