package com.gglozanov.companyprojtracker.repository;

import com.gglozanov.companyprojtracker.model.TaskAssignment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskAssignmentRepository extends CrudRepository<TaskAssignment, Long> {
}