package com.gglozanov.companyprojtracker.mapper;

import com.gglozanov.companyprojtracker.dto.ProjectDTO;
import com.gglozanov.companyprojtracker.model.Project;
import org.modelmapper.ModelMapper;

public class ProjectMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static ProjectDTO toDTO(Project project) {
        return modelMapper.map(project, ProjectDTO.class);
    }

    public static Project toEntity(ProjectDTO projectDTO) {
        return modelMapper.map(projectDTO, Project.class);
    }
}