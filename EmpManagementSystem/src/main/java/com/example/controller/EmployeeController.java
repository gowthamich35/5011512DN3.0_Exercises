package com.example.controller;

import com.example.dto.EmpSummaryDTO;
import com.example.projection.CustomPro;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/projections/custom-details")
    public ResponseEntity<List<CustomPro>> getCustomEmployeeDetails() {
        List<CustomPro> projections = employeeService.getCustomEmployeeDetails();
        return ResponseEntity.ok(projections);
    }

    @GetMapping("/projections/summary/{departmentId}")
    public ResponseEntity<List<EmpSummaryDTO>> getEmployeeSummariesByDepartmentId(@PathVariable Long departmentId) {
        List<EmpSummaryDTO> summaries = employeeService.getEmployeeSummariesByDepartmentId(departmentId);
        return ResponseEntity.ok(summaries);
    }
}