package com.gglozanov.companyprojtracker.controller;

import com.gglozanov.companyprojtracker.model.Project;
import com.gglozanov.companyprojtracker.repository.ProjectRepository;
import com.gglozanov.companyprojtracker.controller.ProjectController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@WebMvcTest(ProjectController.class)
public class ProjectControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectController projectController;

    @Test
    public void testGetAllProjects() throws Exception {
        // Mock data
        Project project1 = new Project(5L, "Project 5", true, new HashSet<>());
        Iterable<Project> mockProjects = Collections.singletonList(project1);

        // Mock repository method
        Mockito.when(projectRepository.findAll()).thenReturn(mockProjects);

        // Perform GET request to /projects
        mockMvc.perform(MockMvcRequestBuilders.get("/projects"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(mockProjects.toString()));
    }

    @Test
    public void testGetAllActiveProjects() throws Exception {
        // Mock data
        Project project1 = new Project(6L, "Project 5", true, new HashSet<>());

        List<Project> mockProjects = Collections.singletonList(project1);

        // Mock repository method
        Mockito.when(projectRepository.findActiveProjects()).thenReturn(mockProjects);

        // Perform GET request to /active_projects
        mockMvc.perform(MockMvcRequestBuilders.get("/active_projects"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(mockProjects.toString()));
    }
}
