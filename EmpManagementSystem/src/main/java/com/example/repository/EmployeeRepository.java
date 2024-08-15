package com.example.repository;

import com.example.dto.EmpSummaryDTO;
import com.example.model.Employee;
import com.example.projection.CustomPro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT new com.companyname.ems.dto.EmployeeSummary(e.name, e.email, d.name) " +
           "FROM Employee e JOIN e.department d WHERE d.id = :departmentId")
    List<EmpSummaryDTO> findEmployeeSummariesByDepartmentId(@Param("departmentId") Long departmentId);
    List<CustomPro> findCustomEmployeeDetails();

}