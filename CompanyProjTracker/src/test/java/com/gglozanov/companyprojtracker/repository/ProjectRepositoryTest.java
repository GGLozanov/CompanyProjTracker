package com.gglozanov.companyprojtracker.repository;

import com.gglozanov.companyprojtracker.model.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class ProjectRepositoryTest {

    @Autowired
    private ProjectRepository projectRepository;

    @Test
    public void testFindByProjectName() {
        // Given
        Project project = new Project(10L,"Test Project", true,new HashSet<>());
        projectRepository.save(project);

        // When
        Project foundProject = projectRepository.findByProjectName("Test Project");

        // Then
        assertNotNull(foundProject);
        assertEquals("Test Project", foundProject.getProjectName());
    }

    @Test
    public void testFindActiveProjects() {
        // Given
        Project activeProject1 = new Project(11L,"Active Project 1", true, new HashSet<>());
        Project inactiveProject = new Project(12L, "Inactive Project", false, new HashSet<>());
        Project activeProject2 = new Project(13L, "Active Project 2", true, new HashSet<>());
        projectRepository.saveAll(List.of(activeProject1, inactiveProject, activeProject2));

        // When
        List<Project> activeProjects = projectRepository.findActiveProjects();

        // Then
        assertEquals(2, activeProjects.size());
        assertEquals("Active Project 1", activeProjects.get(0).getProjectName());
        assertEquals("Active Project 2", activeProjects.get(1).getProjectName());
    }
}
