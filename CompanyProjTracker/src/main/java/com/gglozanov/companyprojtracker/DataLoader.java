package com.gglozanov.companyprojtracker;

import com.gglozanov.companyprojtracker.model.Employee;
import com.gglozanov.companyprojtracker.model.Project;
import com.gglozanov.companyprojtracker.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements ApplicationRunner {

    private ProjectRepository projectRepository;

    @Autowired
    public DataLoader(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void run(ApplicationArguments args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(0L, "Misho"));
        projectRepository.save(new Project(0L, "ad", false, employeeSet));
        projectRepository.save(new Project(1L, "SDsd", true, employeeSet));
        projectRepository.save(new Project(2L, "ASDASC", false, employeeSet));
    }
}