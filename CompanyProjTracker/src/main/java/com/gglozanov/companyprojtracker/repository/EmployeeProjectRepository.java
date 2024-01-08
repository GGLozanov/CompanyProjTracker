package com.gglozanov.companyprojtracker.repository;

import com.gglozanov.companyprojtracker.model.EmployeeProject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProjectRepository extends CrudRepository<EmployeeProject, Long> {
}
