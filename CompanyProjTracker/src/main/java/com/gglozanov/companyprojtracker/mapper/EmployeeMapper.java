package com.gglozanov.companyprojtracker.mapper;

import com.gglozanov.companyprojtracker.dto.EmployeeDTO;
import com.gglozanov.companyprojtracker.model.Employee;
import org.modelmapper.ModelMapper;

public class EmployeeMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static EmployeeDTO toDTO(Employee employee) {
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    public static Employee toEntity(EmployeeDTO employeeDTO) {
        return modelMapper.map(employeeDTO, Employee.class);
    }
}
