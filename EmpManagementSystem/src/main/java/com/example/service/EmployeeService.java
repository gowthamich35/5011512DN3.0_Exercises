package com.example.service;

import com.example.dto.EmpSummaryDTO;
import com.example.projection.CustomPro;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<CustomPro> getCustomEmployeeDetails() {
        return employeeRepository.findCustomEmployeeDetails();
    }

    public List<EmpSummaryDTO> getEmployeeSummariesByDepartmentId(Long departmentId) {
        return employeeRepository.findEmployeeSummariesByDepartmentId(departmentId);
    }
}