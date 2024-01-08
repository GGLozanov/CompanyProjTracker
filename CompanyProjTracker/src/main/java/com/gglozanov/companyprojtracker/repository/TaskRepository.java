package com.gglozanov.companyprojtracker.repository;

import com.gglozanov.companyprojtracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    // Retrieve task by task name
    Task findByTaskName(String taskName);
}